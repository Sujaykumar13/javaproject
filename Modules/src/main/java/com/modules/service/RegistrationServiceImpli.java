package com.modules.service;

import com.modules.dto.RegistrationDto;
import com.modules.entity.LoginEntity;
import com.modules.entity.RegistrationEntity;
import com.modules.repository.RegistrationRepoInterface;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class RegistrationServiceImpli implements RegistrationServiceInterface{


    private static String UPLOADED_FOLDER = "C://Photos//";

    @Autowired
    RegistrationRepoInterface registrationRepoInterface;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public boolean saveData(RegistrationDto dto) {
        System.out.println("dto in service"+dto);

        RegistrationDto dtoFindByEmail = findByEmail(dto.getEmailId());
        System.out.println("Dto Find By Email"+dtoFindByEmail);

        RegistrationDto dtoFindByMobileNumber = findByMobileNumber(dto.getContactNumber());
        System.out.println("Dto Find By MobileNumber"+dtoFindByMobileNumber);

        if(dto.getPassword().equals(dto.getConfirmPassword()) && dtoFindByMobileNumber==null && dtoFindByEmail==null) {
            String encode = bCryptPasswordEncoder.encode(dto.getPassword());
            dto.setPassword(encode);
            dto.setFileName("dummy.jfif");
            dto.setContentType("image/jpeg");
            System.out.println("etitty service----------------------------------"+dto);
            RegistrationEntity entity=new RegistrationEntity();
            BeanUtils.copyProperties(dto,entity);
//            entity.setNoOfAtempts(0);
//            entity.setEnabled(true);
            System.out.println("entity inside if"+entity);
            registrationRepoInterface.saveData(entity);
            return true;
        }
        else {

            return false;
        }
    }

    @Override
    public RegistrationDto findByEmail(String email) {
        RegistrationEntity entity = registrationRepoInterface.findByEmail(email);
        System.out.println(entity+"service");
        if(entity!=null) {
            RegistrationDto dto = new RegistrationDto();
            BeanUtils.copyProperties(entity, dto);
            return dto;
        }
        return null;
    }

    @Override
    public RegistrationDto findByMobileNumber(Long mobileNumber) {
        RegistrationEntity entity = registrationRepoInterface.findByMobileNumber(mobileNumber);
        System.out.println(entity);
        if(entity!=null) {
            RegistrationDto dto = new RegistrationDto();
            BeanUtils.copyProperties(entity, dto);
            return dto;
        }
        return null;
    }

    @Override
    public boolean login(String email, String password) {
        System.out.println(email);
        System.out.println(password);

        RegistrationEntity dtoFindByEmail = registrationRepoInterface.findByEmail(email);
        System.out.println(dtoFindByEmail);

       if(dtoFindByEmail!=null)
       {
           System.out.println("email====================="+dtoFindByEmail.getEmailId());
           System.out.println("password===  =================="+dtoFindByEmail.getPassword());
           System.out.println(email);
           System.out.println(password);
         if(dtoFindByEmail.getNoOfAtempts()<4) {
             if (bCryptPasswordEncoder.matches(password, dtoFindByEmail.getPassword())) {
                 RegistrationEntity entity1 = new RegistrationEntity();
                 BeanUtils.copyProperties(dtoFindByEmail, entity1);
                 entity1.setEnabled(true);
                 entity1.setNoOfAtempts(0);
                 registrationRepoInterface.loginUpdate(entity1);
                 System.out.println(dtoFindByEmail.getEmailId());

                 LoginEntity loginfetchDetails = registrationRepoInterface.findLoginDetails(email);
                 if(loginfetchDetails!=null)
                 {
                     LoginEntity entity=new LoginEntity();
                     loginfetchDetails.setEmailId(email);
                     loginfetchDetails.setLogInTime(LocalTime.now().toString());
                     loginfetchDetails.setLogInDate(LocalDate.now().toString());
                     registrationRepoInterface.login(loginfetchDetails);
                 }
                 else {
                     LoginEntity entity = new LoginEntity();
                     System.out.println(LocalDate.now().toString());
                     System.out.println(LocalTime.now().toString());
                     entity.setEmailId(email);
                     entity.setLogInDate(LocalDate.now().toString());
                     entity.setLogInTime(LocalTime.now().toString());
                     registrationRepoInterface.login(entity);
                 }

                 return true;
             } else {
                 RegistrationEntity entity = new RegistrationEntity();
                 BeanUtils.copyProperties(dtoFindByEmail, entity);
                 int atempts = entity.getNoOfAtempts();
                 atempts++;
                 entity.setNoOfAtempts(atempts);
                 if (atempts >= 3) {
                     entity.setEnabled(false);
                 }

                 registrationRepoInterface.loginUpdate(entity);
                 return false;

             }
         }
       }

           return false;

    }

    @Override
    public boolean saveOtp(String otp, String email) {
        System.out.println("otp"+otp+"email==="+email);
        RegistrationEntity dtoFindByEmail = registrationRepoInterface.findByEmail(email);
        if(dtoFindByEmail!=null)
        {
            RegistrationEntity entity=new RegistrationEntity();
            BeanUtils.copyProperties(dtoFindByEmail,entity);
            entity.setOtp(otp);
            registrationRepoInterface.saveOtp(entity);
            return true;
        }
        return false;
    }

    @Override
    public boolean verifyOtp(String email, String otp) {
        System.out.println("in service otp"+otp+"email"+email);
        RegistrationEntity dtoFindByEmail = registrationRepoInterface.findByEmail(email);

        if(dtoFindByEmail!=null)
        {
           if(dtoFindByEmail.getOtp().equals(otp))
           {
               return true;
           }
           else {
               return false;
           }
        }

        return false;
    }

    @Override
    public boolean resetPassword(String email, String password, String confirmPassword) {

        System.out.println("email in service reset================="+email+"password"+password+"confirm password"+confirmPassword);

        RegistrationEntity dtoFindByEmail = registrationRepoInterface.findByEmail(email);
        System.out.println("dto fetch from dataase"+dtoFindByEmail);
        if(dtoFindByEmail!=null)
        {
            if(password.equals(confirmPassword) && password!=null && confirmPassword!=null)
            {
                RegistrationEntity entity=new RegistrationEntity();
                BeanUtils.copyProperties(dtoFindByEmail,entity);
                String encode = bCryptPasswordEncoder.encode(password);
                entity.setPassword(encode);
                entity.setNoOfAtempts(0);
                entity.setEnabled(true);
                registrationRepoInterface.resetPassword(entity);
                return true;
            }
            return false;
        }

        return false;
    }

    @Override
    public RegistrationDto loginDetails(String email) {
        RegistrationEntity entity = registrationRepoInterface.findByEmail(email);
        System.out.println(entity+"service");
        if(entity!=null) {
            RegistrationDto dto = new RegistrationDto();
            BeanUtils.copyProperties(entity, dto);
            return dto;
        }
        return null;
    }

    @Override
    public void logout(String email) {
        LoginEntity dto = registrationRepoInterface.findLoginDetails(email);
        System.out.println("entity from logindteails"+dto);
        if(dto!=null) {
            LoginEntity entity = new LoginEntity();
            BeanUtils.copyProperties(dto, entity);
            entity.setLogOutTime(LocalTime.now().toString());
            registrationRepoInterface.login(entity);
        }
    }

    @Override
    public boolean updateData(RegistrationDto dto, MultipartFile file) {
        System.out.println("dto in service"+dto);

            String encode = bCryptPasswordEncoder.encode(dto.getPassword());
            dto.setPassword(encode);

        if(file.isEmpty()){
            RegistrationEntity dtoFindByEmail = registrationRepoInterface.findByEmail(dto.getEmailId());
            dto.setFileName(dtoFindByEmail.getFileName());
            dto.setContentType(dtoFindByEmail.getContentType());
        }
        else {
            try {
                // Get the file and save it somewhere
                byte[] bytes = file.getBytes();
                Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
                Files.write(path, bytes);
                dto.setContentType(file.getContentType());
                System.out.println("file content type================"+file.getContentType());
                dto.setFileName(file.getOriginalFilename());
                System.out.println("file name================"+file.getOriginalFilename());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
            RegistrationEntity entity=new RegistrationEntity();
            BeanUtils.copyProperties(dto,entity);
            System.out.println("entity inside if"+entity);
            registrationRepoInterface.updateData(entity);
            return true;

    }
}
