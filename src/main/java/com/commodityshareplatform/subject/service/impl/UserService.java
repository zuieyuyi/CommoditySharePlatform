package com.commodityshareplatform.subject.service.impl;

import com.commodityshareplatform.subject.bean.User;
import com.commodityshareplatform.subject.bean.UserExample;
import com.commodityshareplatform.subject.dao.UserMapper;
import com.commodityshareplatform.subject.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户服务
 */
@Service
public class UserService implements IUserService {
    @Autowired
    UserMapper userMapper;

    /**
     * 查询全部用户
     * @return 全部用户
     */
    public List<User> selectAllUser(){
        List<User> users = userMapper.selectByExample(null);
        return users;
    }

    /**
     * 通过id查用户
     * @param id 用户id
     * @return  用户
     */
    public User selectById(Integer id){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserIdEqualTo(id);
        List<User> users = userMapper.selectByExample(userExample);
        User user = users.get(0);
        return user;
    }

    /**
     * 通过id删除用户
     * @param id 用户id
     * @return 删记录数
     */
    public Integer deleteUserById(Integer id){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserIdEqualTo(id);
        int result = userMapper.deleteByExample(userExample);
        return result;
    }

    /**
     * 通过id更新用户
     * @param user 跟新的用户数据
     * @return 跟新结果
     */
    @Override
    public Integer updateUserById(User user) {
        return null;
    }

    /**
     * 通过id插入用户
     * @param id
     * @return
     */
    @Override
    public Integer insertUserById(Integer id) {
        return null;
    }
}
