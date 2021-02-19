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
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/user/{userId}",method = RequestMethod.GET)
    @ResponseBody
    public Result getUserById(@PathVariable("userId") Integer userId){
        User user = userService.selectUserById(userId);
        return ResultUtils.success(user);
    }

    /**
     * 添加用户
     */
    @RequestMapping(value = "user",method = RequestMethod.POST)
    @ResponseBody
    public Result addUser(User user){
        Integer result = userService.insertUser(user);
        if (result != null){
            return ResultUtils.success();
        }else{
            return ResultUtils.error(-1,"用户添加失败");
        }
    }

    @RequestMapping(value = "user",method = RequestMethod.PUT)
    @ResponseBody
    public Result saveUser(User user){
        Integer result = userService.updateUser(user);
        if (result != null){
            return ResultUtils.success();
        }else{
            return ResultUtils.error(-1,"用户保存失败");
        }
    }

    @RequestMapping(value = "user/{userId}",method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteUser(@PathVariable("userId") Integer userId){
        Integer result = userService.deleteUserById(userId);
        if (result != null){
            return ResultUtils.success();
        }else{
            return ResultUtils.error(-1,"用户保存失败");
        }
    }

}
