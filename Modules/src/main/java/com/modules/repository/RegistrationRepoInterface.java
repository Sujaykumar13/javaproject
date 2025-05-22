package com.modules.repository;

import com.modules.entity.LoginEntity;
import com.modules.entity.RegistrationEntity;

public interface RegistrationRepoInterface {

    void saveData(RegistrationEntity entity);

    RegistrationEntity findByEmail(String email);

    RegistrationEntity findByMobileNumber(Long mobileNumber);

    void login(LoginEntity entity);

    void loginUpdate(RegistrationEntity entity);

    void saveOtp(RegistrationEntity entity);

    void resetPassword(RegistrationEntity entity);

    LoginEntity findLoginDetails(String email);

    void logout(LoginEntity entity);

    void updateData(RegistrationEntity entity);
}
