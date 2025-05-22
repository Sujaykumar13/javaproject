package com.registerpage.repository;

import com.registerpage.dto.RegisterDto;
import com.registerpage.entity.RegisterEntity;

import java.util.List;

public interface RegisterRepoInterface {

    void saveData(RegisterEntity entity);

    List<RegisterEntity> fetchData();

    RegisterEntity findById(Integer id);

    RegisterEntity findByEmail(String email);

    void updateData(RegisterEntity entity);

    boolean deleteById(Integer id);
}
