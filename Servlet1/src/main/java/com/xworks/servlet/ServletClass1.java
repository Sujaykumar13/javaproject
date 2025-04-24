package com.xworks.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(urlPatterns = "/form",loadOnStartup = 1)
public class ServletClass1 extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("this is init method");
    }
    //in servlet init method will execute first y default whenn we override it print the value

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println("this is service method");
    }
    //service method runs after init method
 

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("it is a get method");
    }
    //when we use get and service than service will execute because service as high priority

    @Override
    public void destroy() {
        System.out.println("it is destroy method");
    }
    //destroy method runs when we stop the server and it run by default when we overrid
}
