package com.xworks.controller;

import com.xworks.dto.StudentDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class ControllerClass {
    public ControllerClass() {
        System.out.println("it is a controller class");
    }

    @GetMapping("formdata")
    public String getRequest(StudentDto dto, @RequestParam ("Gender") String gender,@RequestParam String dropdown,@RequestParam String check)
            //we can alias name for request param or directly enter the name
            //when we add @RequestParam than we need to select or enter value in front end
    {
        System.out.println("this is request");
        System.out.println("studentName==============="+dto.getStudentName());
        System.out.println("parentName==============="+dto.getParentName());
        System.out.println("age==============="+dto.getAge());
        System.out.println("phoneNumber==============="+dto.getPhoneNumber());
        System.out.println("email==============="+dto.getEmail());
        System.out.println("address==============="+dto.getAddress());
        System.out.println("birthdate==============="+dto.getBirthDate());
        System.out.println("gender==============="+gender);
        System.out.println("combination==============="+dropdown);
        System.out.println("check==============="+check);

        return "next.jsp";
    }


}
