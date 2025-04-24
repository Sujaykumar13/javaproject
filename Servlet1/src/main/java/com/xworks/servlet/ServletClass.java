package com.xworks.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

//@WebServlet(urlPatterns = "/first",loadOnStartup = 1)
public class ServletClass extends GenericServlet {

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
    public void destroy() {
        System.out.println("it is destroy method");
    }
    //destroy method runs when we stop the server and it run by default when we override it print the value
}
