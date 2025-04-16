package com.xworks.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController-we can use it instead of conntoller only during when we need @ResponseBody in method level
@Controller//it is also alias ame for component for Controller pacakge we can use both controller and Component
@RequestMapping("/")//(we can use in class or method level)to map the request from front end
//inside parenthesis we need to mention to search and it is not mandatory
public class ControllerClass {

    public ControllerClass() {
        System.out.println("it is a controller class");
    }
    //@ResponseBody - to return dto in json form we need mention it
    @RequestMapping("request")
    public String getFirstRequest()//when we not return any page than return type is void and to return page/dto
    // we need to add return type as String
    {
        System.out.println("we get first request");
        return "first.jsp";
    }

    @RequestMapping("next")
    public String getSecondRequest()
    {
        System.out.println("we get second request");
        return "index.jsp";
    }


}
