package com.registerpage.controller;

import com.registerpage.dto.RegisterDto;
import com.registerpage.service.RegisterServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class ControllerClass {

    @Autowired
    RegisterServiceInterface registerServiceInterface;



    @PostMapping("register")
    public String saveData(@Valid RegisterDto dto, BindingResult bindingResult, Model model)
    {
       if(bindingResult.hasErrors())
       {
           System.out.println("error in page");
           List<ObjectError> errors = bindingResult.getAllErrors();
           String error = errors.get(1).getDefaultMessage();
           System.out.println(error);
           model.addAttribute("error",error);
           return "error";
       }

        System.out.println("calling service");
       registerServiceInterface.saveData(dto);

        System.out.println("generating model");
        model.addAttribute("firstName",dto.getFirstName());
        model.addAttribute("lastName",dto.getLastName());
        model.addAttribute("parentName",dto.getParentName());
        model.addAttribute("contact",dto.getContactNumber());
        model.addAttribute("email",dto.getEmail());
        model.addAttribute("birthDate",dto.getBirthDate());

        return "register";
    }

    @RequestMapping("fetch")
    public String fetchData(Model model)
    {

        List<RegisterDto> dtos = registerServiceInterface.fetchData();
        System.out.println("fetched data"+dtos);
        model.addAttribute("fetch",dtos);
        return "fetch";
    }

    @RequestMapping("getProfilePage")
    public String getProfileById(Model model, @RequestParam Integer id)
    {
        System.out.println(id);
        RegisterDto dto = registerServiceInterface.findById(id);
        System.out.println(dto);
        model.addAttribute("dto",dto);
        return "profile";
    }

    @RequestMapping("getProfilePageByEmail")
    public String getProfileByEmail(Model model, @RequestParam String email)
    {
        System.out.println(email);
        RegisterDto dto = registerServiceInterface.findByEmail(email);
        System.out.println(dto);
        model.addAttribute("dto",dto);
        return "profile";
    }

    @PostMapping("update")
    public String updateData(RegisterDto dto)
    {

        registerServiceInterface.updateData(dto);
        return "success";
    }

    @RequestMapping("deleteData/{id}")
    public String deleteData(Model model, @PathVariable Integer id)
    {
        boolean delete = registerServiceInterface.deleteById(id);

        if(delete)
        {
            model.addAttribute("dto","deleted successfully");
            return "delete";
        }
        else {
            model.addAttribute("dto","not deleted");
            return "delete";
        }

    }
}
