package com.commodityshareplatform.subject.interceptor;

import com.commodityshareplatform.subject.bean.Admin;
import com.commodityshareplatform.subject.service.ILoginService;
import com.commodityshareplatform.subject.utils.MD5Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

    /**
     * 拦截登录信息进行认证
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username == null || "".equals(username)) {
            logger.info("未输入用户登录");
            request.getSession().removeAttribute("msg");
            request.getSession().setAttribute("msg", "请输入用户名和密码");
            response.sendRedirect(request.getContextPath() + "/to_login");
//            request.getRequestDispatcher("/to_login").forward(request,response);
            return false;
        }
        //先检查数据库中是否有该用户
        List<Admin> admins = loginService.getAdminByName(username);
        if (admins.size() > 0) {
            for (int i = 0; i < admins.size(); i++) {
                Admin admin = admins.get(i);
                String adminPassword = admin.getAdminPassword();
                if (MD5Utils.stringToMD5(password).equals(adminPassword)) {
                    logger.info(username + "用户登录成功");
                    //将用户名以及加密过的密码保存session中
                    request.getSession().setAttribute("username", username);
                    request.getSession().setAttribute("password", MD5Utils.stringToMD5(password));
                    request.getSession().removeAttribute("msg");
                    return true;
                } else if (i == admins.size() - 1) {
                    logger.info(username + "用户登录密码错误");
                    request.getSession().removeAttribute("msg");
                    request.getSession().setAttribute("msg", "用户密码错误");
                    response.sendRedirect(request.getContextPath() + "/to_login");
                    return false;
                }
            }
        }
        logger.info("没有该用户");
        request.getSession().removeAttribute("msg");
        request.getSession().setAttribute("msg", "没有该用户");
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
