package com.xworks.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ConfigClass.class};
    }

    @Override
    protected String[] getServletMappings()//to map request for controller throw event handler
     {
        return new String[]{"/"};//it is like array and "/" is mandtaory to mention to map
    }
}
