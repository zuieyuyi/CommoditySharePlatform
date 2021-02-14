package com.commodityshareplatform.subject.service.impl;

import com.commodityshareplatform.subject.bean.User;
import com.commodityshareplatform.subject.bean.UserExample;
import com.commodityshareplatform.subject.dao.UserMapper;
import com.commodityshareplatform.subject.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
    public User selectUserById(Integer id){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserIdEqualTo(id);
        List<User> users = userMapper.selectByExample(userExample);
        User user = users.get(0);
        return user;
    }

    /**
     * 通过id让用户失效用户
     * @param id 用户id
     * @return 删记录数
     */
    @Transactional(propagation = Propagation.REQUIRES_NEW,
            isolation = Isolation.READ_COMMITTED,
            readOnly = false,
            timeout = 2,
            rollbackFor = {Exception.class})
    public Integer deleteUserById(Integer id){
//        UserExample userExample = new UserExample();
//        UserExample.Criteria criteria = userExample.createCriteria();
//        criteria.andUserIdEqualTo(id);
//        int result = userMapper.deleteByExample(userExample);
        User user = selectUserById(id);
        user.setIsValid(0);
        int result = userMapper.updateByExample(user, null);
        return result;
    }

    /**
     * 更新用户
     * @param user 跟新的用户数据
     * @return 跟新结果
     */
    @Override
    public Integer updateUserById(User user) {
//        UserExample userExample = new UserExample();
//        UserExample.Criteria criteria = userExample.createCriteria();
//        criteria.andUserIdEqualTo(user.getUserId());
        int result = userMapper.updateByExample(user, null);
        return result;
    }

    /**
     * 通过插入用户
     * @param user
     * @return
     */
    @Override
    public Integer insertUserById(User user) {
        int result = userMapper.insertSelective(user);
        return result;
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @Override
    public Integer deleteUserBatchById(List<Integer> ids) {
        Integer result = 0;
        for (Integer id:ids){
            result += deleteUserById(id);
        }
        return result;
    }
}
