package com.xworks.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
//@NoArgsConstructor
//@RequiredArgsConstructor

public class StudentDto {

    private String studentName;
    private String parentName;
    private String age;
    private String phoneNumber;
    private String email;
    private String birthDate;
    private String address;

}
