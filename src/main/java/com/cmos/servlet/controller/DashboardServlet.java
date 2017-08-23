package com.cmos.servlet.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DashboardServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("do get " + this.getServletName());
        PrintWriter out = resp.getWriter();
        out.write("This is my first servlet web project.");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("do post " + this.getServletName());
        this.doGet(req , resp);
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
