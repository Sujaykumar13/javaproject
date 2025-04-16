package com.xworks.spring.controller;

import com.xworks.spring.dto.StudentDto;
import com.xworks.spring.service.ServiceImpli;
import com.xworks.spring.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class ControllerClass {

    @Autowired
    ServiceInterface serviceInterface;
    public ControllerClass() {
        System.out.println("it is a controller class");
    }

    @GetMapping("formdata")//we can use both get and post
    public String getRequest(StudentDto dto, @RequestParam("Gender") String gender, @RequestParam String dropdown, @RequestParam String check, Model model)
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

        System.out.println("generating model view=================================");
        model.addAttribute("name",dto.getStudentName());
        model.addAttribute("parentname",dto.getParentName());
        model.addAttribute("email",dto.getEmail());
        model.addAttribute("age",dto.getAge());
        model.addAttribute("phone",dto.getPhoneNumber());
        model.addAttribute("birth",dto.getBirthDate());
        model.addAttribute("address",dto.getAddress());
        model.addAttribute("gender",gender);
        model.addAttribute("combination",dropdown);

        System.out.println("sending student dto to service");
        serviceInterface.saveData(dto,gender,dropdown);

        return "new.jsp";
    }
}
