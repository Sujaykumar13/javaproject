package com.xworks.spring.service;

import com.xworks.spring.dto.StudentDto;

public interface ServiceInterface {
    StudentDto saveData(StudentDto dto,String gender,String combination);
}
