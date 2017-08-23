package com.cmos.servlet.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RequestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("do get " + this.getServletName());
        PrintWriter out = resp.getWriter();
        out.write("\n this servlet getMethod " + req.getMethod());
        out.write("\n this servlet getAuthType " + req.getAuthType());
        out.write("\n this servlet getContextPath " + req.getContextPath());
        out.write("\n this servlet getPathInfo " + req.getPathInfo());
        out.write("\n this servlet getPathTranslated " + req.getPathTranslated());
        out.write("\n this servlet getQueryString " + req.getQueryString());
        out.write("\n this servlet getRemoteUser " + req.getRemoteUser());
        out.write("\n this servlet getRequestedSessionId " + req.getRequestedSessionId());
        out.write("\n this servlet getRequestURI " + req.getRequestURI());
        out.write("\n this servlet getServletPath " + req.getServletPath());
        out.write("\n this servlet getCookies " + req.getCookies());
        out.write("\n this servlet getHeaderNames " + req.getHeaderNames());
        out.write("\n this servlet getRequestURL " + req.getRequestURL());
        out.write("\n this servlet getUserPrincipal " + req.getUserPrincipal());
        out.write("\n this servlet getSession " + req.getSession());

        out.write("\n this servlet this.getServletInfo " + this.getServletInfo());
        out.write("\n this servlet this.getServletName " + this.getServletName());
        out.write("\n this servlet this.getInitParameterNames " + this.getInitParameterNames());
        out.write("\n this servlet this.getServletConfig " + this.getServletConfig());
        out.write("\n this servlet this.getServletContext " + this.getServletContext());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("do post " + this.getServletName());
        this.doGet(req, resp);
    }

//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("exectue service method " + this.getServletName());
//    }

    @Override
    public void destroy() {
        System.out.println("execute destory method " + this.getServletName());
    }

    @Override
    public void init() throws ServletException {
        System.out.println("execute init method " + this.getServletName());
    }
}
