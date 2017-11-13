package com.sercet.common.base;

import com.sercet.vo.PBUser;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

/**
 * Created by john on 2017/11/13.
 */
public class IsLoginFilter implements Filter{

    private Map Instance = LoginSessionMap.getInstance();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        HttpSession session =  request.getSession();
        PBUser user = (PBUser)session.getAttribute("user");
        if (request.getContextPath().equals("/sercet")){
            filterChain.doFilter(request,response);
            return;
        }
        if (null == user||!request.getContextPath().startsWith("/sercet")){
            response.sendRedirect("/");
            return;
        }
        if (Instance.get(user.getUserId()).equals(session.getId())){

            filterChain.doFilter(request,response);
        }
        response.sendRedirect("/");

    }

    @Override
    public void destroy() {

    }
}
