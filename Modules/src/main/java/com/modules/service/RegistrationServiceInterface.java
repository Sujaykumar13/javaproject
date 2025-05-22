package com.modules.service;

import com.modules.dto.RegistrationDto;
import com.modules.entity.LoginEntity;
import org.springframework.web.multipart.MultipartFile;

public interface RegistrationServiceInterface {

    boolean saveData(RegistrationDto dto);

    RegistrationDto findByEmail(String email);

    RegistrationDto findByMobileNumber(Long mobileNumber);

    boolean login(String email,String password);

    boolean saveOtp(String otp,String email);

    boolean verifyOtp(String email,String otp);

    boolean resetPassword(String email,String passwordd,String confirmPasswordd);

    RegistrationDto loginDetails(String email);

    void logout(String email);

    boolean updateData(RegistrationDto dto, MultipartFile multipartFile);
}
