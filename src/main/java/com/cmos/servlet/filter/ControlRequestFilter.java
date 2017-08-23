package com.cmos.servlet.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.apache.commons.lang3.StringUtils;

public class ControlRequestFilter implements Filter {

    private String encoding;
    private String locale;

    public void init(FilterConfig config) throws ServletException {
        this.encoding = config.getInitParameter("encoding");
        this.locale = config.getInitParameter("locale");
        System.out.println("encoding====" + encoding);
        System.out.println("locale====" + locale);
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;

        String uid = request.getParameter("uid");
        if (StringUtils.isBlank(uid))
            System.out.println("uid不能为空");

        chain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {
        System.out.println("销毁ControlRequestFilter");
    }
}
