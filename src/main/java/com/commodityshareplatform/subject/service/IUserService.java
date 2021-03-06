package com.commodityshareplatform.subject.service;

import com.commodityshareplatform.subject.bean.User;

import java.util.List;

public interface IUserService {
    public List<User> selectAllUser();

    public User selectUserById(Integer id);

    public Integer deleteUserById(Integer id);

    public Integer updateUser(User user);

    public Integer insertUser(User user);

    public Integer deleteUserBatchById(List<Integer> ids);
}
