package com.commodityshareplatform.subject.service.impl;

import com.commodityshareplatform.subject.bean.Admin;
import com.commodityshareplatform.subject.bean.AdminExample;
import com.commodityshareplatform.subject.dao.AdminMapper;
import com.commodityshareplatform.subject.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements ILoginService {
    @Autowired
    AdminMapper adminMapper;

    @Override
    public long countAdmin(String username) {
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andAdminNameEqualTo(username);

        long count = adminMapper.countByExample(adminExample);
        return count;
    }

    @Override
    public List<Admin> getAdminByName(String username){
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andAdminNameEqualTo(username);

        List<Admin> admins = adminMapper.selectByExample(adminExample);
        return admins;
    }
}
