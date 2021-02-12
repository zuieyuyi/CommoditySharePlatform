package com.commodityshareplatform.subject.service;

import com.commodityshareplatform.subject.bean.User;

import java.util.List;

public interface IUserService {
    public List<User> selectAllUser();

    public User selectById(Integer id);

    public Integer deleteUserById(Integer id);

    public Integer updateUserById(User user);

    public Integer insertUserById(Integer id);
}
