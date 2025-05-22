package com.registerpage.service;

import com.registerpage.dto.RegisterDto;

import java.util.List;

public interface RegisterServiceInterface {

    void saveData(RegisterDto dto);

    List<RegisterDto> fetchData();

    RegisterDto findById(Integer id);

    RegisterDto findByEmail(String email);

    void updateData(RegisterDto dto);

    boolean deleteById(Integer id);
}
