package com.commodityshareplatform.subject.controller;

import com.commodityshareplatform.subject.bean.User;
import com.commodityshareplatform.subject.service.IUserService;
import com.commodityshareplatform.subject.utils.Result;
import com.commodityshareplatform.subject.utils.ResultUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("admin")
public class UserController {
    @Autowired
    IUserService userService;

    /**
     * 跳转至用户列表页面
     */
    @RequestMapping("to_users")
    public String toUsersPage(){
        return "admin/user_list";
    }

    /**
     * 全部用户数据
     */
    @RequestMapping(value = "users",method = RequestMethod.GET)
    @ResponseBody
    public Result<User> getAllUsers(){
        List<User> users = userService.selectAllUser();
        return ResultUtils.success(users);
    }

    /**
     * 全部用户数据（分页）
     */
    @RequestMapping(value = "userss",method = RequestMethod.GET)
    @ResponseBody
    public Result<PageInfo> getAllUsers(@RequestParam(value = "pn",defaultValue = "1")Integer pn){
        PageHelper.startPage(pn,5);
        List<User> users = userService.selectAllUser();
        PageInfo pageInfo = new PageInfo(users,5);
        return ResultUtils.success(pageInfo);
    }

}
