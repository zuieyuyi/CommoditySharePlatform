package com.commodityshareplatform.subject.interceptor;

import com.commodityshareplatform.subject.bean.Admin;
import com.commodityshareplatform.subject.service.ILoginService;
import com.commodityshareplatform.subject.utils.MD5Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Component
public class OnlineInterceptor implements HandlerInterceptor {
    @Autowired
    ILoginService loginService;

    private static final Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String username = (String)request.getSession().getAttribute("username");
        String password = (String)request.getSession().getAttribute("password");

        if (username == null||"".equals(username)){
            logger.info("用户未登录");
            request.getSession().removeAttribute("msg");
            request.getSession().setAttribute("msg", "用户未登录");
            response.sendRedirect(request.getContextPath() + "/to_login");
            return false;
        }

        List<Admin> admins = loginService.getAdminByName(username);
        if (admins.size() > 0) {
            for (int i = 0; i < admins.size(); i++) {
                Admin admin = admins.get(i);
                String adminPassword = admin.getAdminPassword();
                if (password.equals(adminPassword)) {
                    logger.info(username + "用户登录未失效");
                    request.getSession().removeAttribute("msg");
                    return true;
                } else if (i == admins.size() - 1) {
                    logger.info("用户登录失效");
                    request.getSession().removeAttribute("msg");
                    request.getSession().setAttribute("msg", "用户密码错误");
                    response.sendRedirect(request.getContextPath() + "/to_login");
                    return false;
                }
            }
        }

        logger.info("用户登录失效");
        request.getSession().removeAttribute("msg");
        request.getSession().setAttribute("msg", "用户登录失效");
        response.sendRedirect(request.getContextPath() + "/to_login");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
