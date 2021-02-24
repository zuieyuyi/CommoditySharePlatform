package com.commodityshareplatform.subject.service;

import com.commodityshareplatform.subject.bean.Admin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ILoginService {
    public long countAdmin(String username);

    public List<Admin> getAdminByName(String username);
}
