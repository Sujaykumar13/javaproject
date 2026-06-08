package com.registerpage.service;

import com.registerpage.dto.DepartmentDto;
import com.registerpage.dto.EmployeeDto;
import com.registerpage.dto.RegisterDto;
import com.registerpage.entity.DepartmentEntity;

import java.util.List;

public interface RegisterServiceInterface {

    void saveData(RegisterDto dto);

    List<RegisterDto> fetchData();

    RegisterDto findById(Integer id);

    RegisterDto findByEmail(String email);

    void updateData(RegisterDto dto);

    boolean deleteById(Integer id);

    void saveDept(DepartmentDto dto);

    void saveEmp(EmployeeDto dto);

    void fetchEmployeList(Integer id);
}
