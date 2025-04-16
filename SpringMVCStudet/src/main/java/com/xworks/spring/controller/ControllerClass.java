package com.xworks.spring.controller;

import com.xworks.spring.dto.StudentDto;
import com.xworks.spring.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class ControllerClass {
    @Autowired
    ServiceInterface serviceInterface;

    public ControllerClass() {
        System.out.println("this is controller class");
    }

    @GetMapping("formdata")
    public String getRegisterPageRequest(@Valid StudentDto dto,  BindingResult bindingResult,Model model, @RequestParam String check)
    {
//        System.out.println("this is request");
//        System.out.println("studentName==============="+dto.getStudentName());
//        System.out.println("parentName==============="+dto.getParentName());
//        System.out.println("age==============="+dto.getAge());
//        System.out.println("phoneNumber==============="+dto.getPhoneNumber());
//        System.out.println("email==============="+dto.getEmail());
//        System.out.println("address==============="+dto.getAddress());
//        System.out.println("birthdate==============="+dto.getBirthDate());
//        System.out.println("gender==============="+dto.getGender());
//        System.out.println("combination==============="+dto.getCombination());
//        System.out.println("check==============="+check);
//        System.out.println(dto);
        if(bindingResult.hasErrors()) {
            System.out.println(bindingResult.hasErrors());
            System.out.println("callig error");
            List<ObjectError> errorList = bindingResult.getAllErrors();
            String error = errorList.get(1).getDefaultMessage();
            System.out.println(error);
            model.addAttribute("error",error);
            return "error";
        }

            System.out.println("callig save data method");
            serviceInterface.addData(dto);

        System.out.println("generating model view=================================");
        model.addAttribute("name",dto.getStudentName());
        model.addAttribute("parentname",dto.getParentName());
        model.addAttribute("email",dto.getEmail());
        model.addAttribute("age",dto.getAge());
        model.addAttribute("phone",dto.getPhoneNumber());
        model.addAttribute("birth",dto.getBirthDate());
        model.addAttribute("address",dto.getAddress());
        model.addAttribute("gender",dto.getGender());
        model.addAttribute("combination",dto.getCombination());

        return "next";
    }

    @RequestMapping("fetch")
    public String getFetchData(Model model)
    {
        List<StudentDto> dto = serviceInterface.fetchData();
        System.out.println("data is fetched"+dto);
        model.addAttribute("fetch",dto);
        return "read";
    }
    @GetMapping("getProfilePage")
    public String getDataById(Model model,@RequestParam Integer id)
    {

        System.out.println(id);
        StudentDto dto = serviceInterface.findDataById(id);
        model.addAttribute("dto",dto);
        System.out.println(dto);
        return "fetch";
    }

    @GetMapping("update")
    public String updataData(StudentDto dto)
    {
        serviceInterface.updateData(dto);
        return "success";
    }

    @GetMapping("deleteData/{id}")
    public String deletaData(@PathVariable Integer id,Model model)
    {
        System.out.println(id);
        boolean delete = serviceInterface.deleteDataService(id);
        if(delete) {
            model.addAttribute("dto","deleted successfully");
            return "delete";
        }
        else{
            model.addAttribute("dto","not deleted");
            return "delete";
        }
    }
}
