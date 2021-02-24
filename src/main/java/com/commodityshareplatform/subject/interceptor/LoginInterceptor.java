package com.commodityshareplatform.subject.interceptor;

import com.commodityshareplatform.subject.bean.Admin;
import com.commodityshareplatform.subject.service.ILoginService;
import com.commodityshareplatform.subject.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Autowired
    ILoginService loginService;

    /**
     * 拦截登录信息进行认证
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String username = (String)request.getAttribute("username");
        String password = (String)request.getAttribute("password");
        //先检查数据库中是否有该用户
        List<Admin> admins = loginService.getAdminByName(username);
        if(admins.size() > 0){
            for (Admin admin:admins){
                String adminPassword = admin.getAdminPassword();
                if (MD5Utils.stringToMD5(password).equals(adminPassword)){
                    return true;
                }else {
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
