package com.commodityshareplatform.subject.controller;

import com.commodityshareplatform.subject.bean.Commodity;
import com.commodityshareplatform.subject.service.ICommodityService;
import com.commodityshareplatform.subject.service.impl.CommodityService;
import com.commodityshareplatform.subject.utils.Result;
import com.commodityshareplatform.subject.utils.ResultUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.*;

@Controller
@RequestMapping("admin")
public class CommodityController {
    @Autowired
    ICommodityService commodityService;

    /**
     * 跳转商品列表页面
     */
    @RequestMapping("to_commodities")
    public String toCommoditiesPage(){
        return "admin/commodity_list";
    }

    /**
     * 跳转商品详情页面
     */
    @RequestMapping(value = "to_commodity_select/{commodityId}",method = RequestMethod.GET)
    public ModelAndView toCommoditySelect(@PathVariable("commodityId") Integer commodityId){
        Commodity commodity = commodityService.selectCommodityById(commodityId);

        ModelAndView mv = new ModelAndView("admin/commodity_select");
        mv.addObject("commodity",commodity);
        return mv;
    }

    /**
     * 获取全部商品(分页)
     */
    @RequestMapping(value = "commodities",method = RequestMethod.GET)
    @ResponseBody
    public Result<PageInfo> getAllCommodities(@RequestParam(value = "pn",defaultValue = "1")Integer pn){
        PageHelper.startPage(pn,5);
        List<Commodity> commodities = commodityService.selectAllCommodities();
        PageInfo page = new PageInfo(commodities,5);
        return ResultUtils.success(page);
    }

    /**
     * 通过id查商品
     */
    @RequestMapping(value = "commodity/{commodityId}",method = RequestMethod.GET)
    @ResponseBody
    public Result<Commodity> getCommodityById(@PathVariable("commodityId") Integer commodityId){
        Commodity commodity = commodityService.selectCommodityById(commodityId);
        return ResultUtils.success(commodity);
    }

    /**
     * 商品添加
     */
    @RequestMapping(value = "commodity",method = RequestMethod.POST)
    @ResponseBody
    public Result<Commodity> addCommodity(HttpServletRequest request,Commodity commodity){
        String contextPath = request.getServletContext().getRealPath("/uploadFile");
        Date date = new Date();
        File imgPath = new File(contextPath + "/" + commodity.getCommodityUserId());
        File[] files = imgPath.listFiles();
        if (files.length == 0){
            return ResultUtils.error(-1,"请上传文件");
        }
        //通过创建日期排序
        File img = files[files.length-1];

        File imgToDir = new File(imgPath.getPath() + "/" + date.getTime());//转移图片路径
        File img2 =  new File(imgToDir.getPath() + "/" + img.getName());

        //创建文件目录
        if (!imgToDir.exists()){
            imgToDir.mkdirs();
        }
        //**
        try {
            FileUtils.copyFile(img,img2);
            img.delete();
        } catch (IOException e) {
            return ResultUtils.error(-1,"图片添加失败");
        }

        commodity.setCommodityImgSrc("/uploadFile/" + commodity.getCommodityUserId() + "/" + date.getTime() + "/" + img2.getName());
        //**
        Integer result = commodityService.insertCommodity(commodity);
        if (result != null){
            return ResultUtils.success();
        }else{
            return ResultUtils.error(-1,"商品添加失败");
        }
    }

    /**
     * 保存商品修改信息
     */
    @RequestMapping(value = "commodity",method = RequestMethod.PUT)
    @ResponseBody
    public Result<Commodity> saveCommodity(HttpServletRequest request,Commodity commodity){
        //获取商品图片路径
        //默认web地址
        String contextPath = request.getServletContext().getRealPath("");
        Commodity com = commodityService.selectCommodityById(commodity.getCommodityId());
        //图片与默认web地址的相对路径
        String commodityImgSrc = com.getCommodityImgSrc();
        //原图
        File oldImg = new File(contextPath + "/" + commodityImgSrc);
        //上传图片地址
        File imgPath = new File(contextPath + "/uploadFile/" + com.getCommodityUserId());
        File[] files = imgPath.listFiles();
        if (files == null){
//            return ResultUtils.error(-1,"请上传文件");
        }else{
            //新图
            File newImg = files[files.length-1];;
            if(newImg.exists()){
                //删除旧图片
                oldImg.delete();
                //转移新图
                File newImgTo = new File(oldImg.getParent(),newImg.getName());
                try {
                    FileUtils.copyFile(newImg,newImgTo);
                    commodity.setCommodityImgSrc(com.getCommodityImgSrc().replaceAll(oldImg.getName(),"") + newImg.getName());
                    newImg.delete();
                } catch (IOException e) {
                    return ResultUtils.error(-1,"图片添加失败");
                }
            }
        }

        if (commodity.getCommodityId() == null || commodity.getCommodityId() == 0){
            return ResultUtils.error(-1,"商品保存失败");
        }
        Integer result = commodityService.updateCommodity(commodity);
        if (result != null){
            return ResultUtils.success();
        }else{
            return ResultUtils.error(-1,"商品保存失败");
        }
    }

    /**
     * 商品删除
     */
    @RequestMapping(value = "/commodity/{commodityId}",method = RequestMethod.DELETE)
    @ResponseBody
    public Result<Commodity> deleteCommodity(@PathVariable("commodityId") Integer commodityId){
        Integer result = commodityService.deleteCommodityById(commodityId);
        if (result != null){
            return ResultUtils.success();
        }else{
            return ResultUtils.error(-1,"商品修改失败");
        }
    }

    /**
     * 保存商品标签
     */
    @RequestMapping(value = "/commodityTags/{commodityId}",method = RequestMethod.PUT)
    @ResponseBody
    public Result saveCommodityTags(@PathVariable("commodityId") Integer commodityId,@RequestParam("commodityTags") String commodityTags){
        Integer result = commodityService.saveCommodityTags(commodityId, commodityTags);
        if (result != null){
            return ResultUtils.success();
        }else{
            return ResultUtils.error(-1,"商品修改失败");
        }
    }

    /**
     * 获取商品标签
     */
    @RequestMapping(value = "/commodityTags/{commodityId}",method = RequestMethod.GET)
    @ResponseBody
    public Result<String> getCommodityTags(@PathVariable("commodityId") Integer commodityId){
        String commodityTags = commodityService.getCommodityTags(commodityId);
        return ResultUtils.success(commodityTags);
    }

    /**
     * 保存图片
     * @param file
     * @return
     */
    @RequestMapping(value = "imgUpload",method = RequestMethod.POST)
    @ResponseBody
    public Result save(@RequestParam("file") MultipartFile file, HttpServletRequest request) throws IOException {
        String contextPath = request.getServletContext().getRealPath("/uploadFile");
        //根据文件创建目录
        String userId = request.getParameter("userId") == null?"":request.getParameter("userId");
//        String commodityId = request.getParameter("commodityId") == null?"":request.getParameter("commodityId");
        File dir = null;
        if (!StringUtils.isEmpty(userId)){
            dir = new File(contextPath+"\\"+userId);
            if (!dir.exists()){
                dir.mkdirs();
//                contextPath += "\\" + userId;
            }else {
                File[] files = dir.listFiles();
                for (File f: files){
                    if (f.isFile()){
                        f.delete();
                    }
                }
            }
        }
//        if (!StringUtils.isEmpty(commodityId)){
//
//        }

        // 保存图片的路径，图片上传成功后，将路径保存到数据库
//        String filePath = "F:\\upload";
//         获取原始图片的扩展名
        String originalFilename = file.getOriginalFilename();
        // 生成文件新的名字
        String newFileName = UUID.randomUUID() + originalFilename;
        // 封装上传文件位置的全路径
        File targetFile = new File(dir, newFileName);
        file.transferTo(targetFile);

        return ResultUtils.success();
    }
}
