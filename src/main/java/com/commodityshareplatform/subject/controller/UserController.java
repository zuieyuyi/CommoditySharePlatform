package com.commodityshareplatform.subject.controller;

import com.commodityshareplatform.subject.bean.User;
import com.commodityshareplatform.subject.service.IUserService;
import com.commodityshareplatform.subject.utils.Result;
import com.commodityshareplatform.subject.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("admin")
public class UserController {
    @Autowired
    IUserService userService;

    @RequestMapping(value = "users",method = RequestMethod.GET)
    @ResponseBody
    public Result<User> getAllUsers(){
        List<User> users = userService.selectAllUser();
        return ResultUtils.success(users);
    }
}
