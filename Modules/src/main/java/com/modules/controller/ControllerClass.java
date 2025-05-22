package com.modules.controller;

import com.modules.dto.RegistrationDto;
import com.modules.service.RegistrationServiceInterface;
import com.modules.util.EmailSender;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.*;
import java.util.List;

@Controller
@RequestMapping("/")
public class ControllerClass {

    private static String UPLOADED_FOLDER = "C://Photos//";

    @Autowired
    RegistrationServiceInterface registrationServiceInterface;

    @Autowired
    EmailSender emailSender;

    @RequestMapping("register")
    public String callRegisterPage() {
        System.out.println("calling register page");
        return "registration";
    }

    @RequestMapping("login")
    public String callLoginPage() {
        System.out.println("calling login page");
        return "login";
    }

    @RequestMapping("forgot")
    public String callForgotPasswordPage() {
        return "forgotpassword";
    }

    @RequestMapping("index")
    public String callHomePage() {
        System.out.println("calling Home Page");
        return "index";
    }


    @PostMapping("formdata")
    public String saveData(@Valid RegistrationDto dto, Model model, BindingResult bindingResult) {
        System.out.println("dto in cotroller" + dto);

        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.hasErrors());
            List<ObjectError> errorList = bindingResult.getAllErrors();
            String error = errorList.get(1).getDefaultMessage();
            System.out.println(error);
            model.addAttribute("error", "enter valid data");
            return "registration";
        }

        boolean result = registrationServiceInterface.saveData(dto);
        if (result) {
            model.addAttribute("msg", "registered successfully");
            return "registration";
        } else {
            model.addAttribute("error", "enter valid data");
            return "registration";
        }
    }

    @GetMapping("loginform")
    public String login(@RequestParam String emailId, @RequestParam String password, Model model) {
        RegistrationDto dtoDetails = registrationServiceInterface.findByEmail(emailId);
        System.out.println("calling login service" + emailId + " and  " + password);
        boolean result = registrationServiceInterface.login(emailId, password);

        if (result) {
            model.addAttribute("msg", "login successfully");
            model.addAttribute("name",dtoDetails.getFirstName());
            model.addAttribute("email",dtoDetails.getEmailId());
            model.addAttribute("file",dtoDetails.getFileName());
            return "profile";
        } else {
            System.out.println("is enabled" + dtoDetails);
            if (dtoDetails.isEnabled()) {
                model.addAttribute("msg", "");
            } else {
                model.addAttribute("msg", "account blocked");
                model.addAttribute("dto", dtoDetails.getEmailId());
                return "forgotpassword";
            }
            model.addAttribute("msg", "invalid email and password");
            model.addAttribute("dto", dtoDetails.getEmailId());
            return "login";
        }
    }

    @RequestMapping("emailExist")
    @ResponseBody
    public ResponseEntity<String> emailExists(@RequestParam String emailId) {
        RegistrationDto emailIsExist = registrationServiceInterface.findByEmail(emailId);
        if (emailIsExist != null) {
            return ResponseEntity.ok("email is exist");
        }
        return ResponseEntity.ok("email accepted");
    }

    @RequestMapping("contactNumberExist")
    @ResponseBody//we can use restcotroller in controller instead of response body
    public ResponseEntity<String> phoneNumberExists(@RequestParam Long contactNumber) {
        RegistrationDto contactNumberExists = registrationServiceInterface.findByMobileNumber(contactNumber);
        if (contactNumberExists != null) {
            return ResponseEntity.ok("contact Number is exist");
        }
        return ResponseEntity.ok("contact number accepted");

    }

    @PostMapping("sendOtp")
    public String getOtp(@RequestParam String emailId,Model model)
    {
        RegistrationDto dtoFindByEmail = registrationServiceInterface.findByEmail(emailId);
        model.addAttribute("dto",dtoFindByEmail.getEmailId());
        String otp = emailSender.sendSimpleMessage(emailId);
        System.out.println(otp);
        boolean result = registrationServiceInterface.saveOtp(otp, emailId);
        if(result)
        {
            model.addAttribute("otpmsg","otp send successfully");
        }
        else
        {
            model.addAttribute("otpmsg","otp is not send");
        }
        return "forgotpassword";
    }

    @PostMapping("verificationOTP")
    public String verifyOtp(@RequestParam String emailId,@RequestParam String otp,Model model)
    {
        System.out.println("in controller otp=="+otp+"email"+emailId);
        RegistrationDto dtoFindByEmail = registrationServiceInterface.findByEmail(emailId);
        boolean result = registrationServiceInterface.verifyOtp(emailId, otp);
        if(result)
        {
            model.addAttribute("verifymsg","otp verified");
            model.addAttribute("dto",dtoFindByEmail.getEmailId());
            return "resetpassword";
        }
        else {
            model.addAttribute("verifymsg","otp not verified");
            model.addAttribute("dto",dtoFindByEmail.getEmailId());
            return "forgotpassword";
        }
    }

    @PostMapping("resetform")
    public String resetPassword(@RequestParam String emailId,@RequestParam String password,@RequestParam String confirmPassword,Model model)
    {
        System.out.println("email========"+emailId+"pass===="+password+"confirmpasss"+confirmPassword);
        RegistrationDto dtoFindByEmail = registrationServiceInterface.findByEmail(emailId);
        boolean result = registrationServiceInterface.resetPassword(emailId, password, confirmPassword);
        if(result)
        {
            model.addAttribute("msg","password reset successfully");
            model.addAttribute("dto",dtoFindByEmail.getEmailId());
            return "login";
        }
        else {
            model.addAttribute("msg","password is not reset");
            model.addAttribute("dto",dtoFindByEmail.getEmailId());
            return "resetpassword";
        }
    }

    @RequestMapping("logout")
    public String logOut(@RequestParam String emailId,Model model)
    {
        System.out.println("emailid in logout============"+emailId);
        registrationServiceInterface.logout(emailId);
        return "login";
    }

    @RequestMapping("profile")
    public String profilePage(@RequestParam String emailId,Model model)
    {

        System.out.println("emailid in profile"+emailId);
        RegistrationDto userDetails = registrationServiceInterface.findByEmail(emailId);
        if(userDetails!=null) {
            model.addAttribute("detail",userDetails);
            model.addAttribute("email",userDetails.getEmailId());
            return "userProfile";
        }
        else {
            return "profile";
        }
    }

    @PostMapping("update")
    public String updateDetails(@RequestParam("file") MultipartFile file, RegistrationDto dto, Model model)
    {
        System.out.println("updatedd dto==============================="+dto);
        System.out.println("email================"+dto.getEmailId());
        boolean result = registrationServiceInterface.updateData(dto,file);
        RegistrationDto dtoDetails = registrationServiceInterface.findByEmail(dto.getEmailId());
        if(result)
        {
            model.addAttribute("msg","profile updated successfully");
            model.addAttribute("name",dtoDetails.getFirstName());
            model.addAttribute("email",dtoDetails.getEmailId());
            model.addAttribute("file",dtoDetails.getFileName());
            return "profile";
        }
        else {
            model.addAttribute("error","profile not updated");
            model.addAttribute("name",dtoDetails.getFirstName());
            model.addAttribute("email",dtoDetails.getEmailId());
            model.addAttribute("file",dtoDetails.getFileName());
            return "profile";
        }
    }

    @GetMapping("image")
    public void getImage(@RequestParam String fileName, HttpServletResponse httpServletResponse){

        System.out.println("file name============="+fileName);
        File file=new File(UPLOADED_FOLDER+fileName);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStream inputStream=new BufferedInputStream(fileInputStream);
            ServletOutputStream servletInputStream = httpServletResponse.getOutputStream();
            IOUtils.copy(inputStream,servletInputStream);
            httpServletResponse.flushBuffer();
        }catch (IOException e){

        }
    }

    @RequestMapping("back")
    public String back(@RequestParam String emailId,Model model)
    {
        RegistrationDto dtoDetails = registrationServiceInterface.findByEmail(emailId);
        model.addAttribute("name",dtoDetails.getFirstName());
        model.addAttribute("email",dtoDetails.getEmailId());
        model.addAttribute("file",dtoDetails.getFileName());
        return "profile";
    }
}
