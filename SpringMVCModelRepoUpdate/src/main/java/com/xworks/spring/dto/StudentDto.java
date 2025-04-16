package com.xworks.spring.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class StudentDto {

    @NotNull
    @NotBlank
    @NotEmpty
    private String studentName;
    @NotNull
    @NotBlank
    @NotEmpty
    private String parentName;
    @NotNull
    @NotBlank
    @NotEmpty
    private String age;
    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min=10)
    private String phoneNumber;
    @NotNull
    @NotBlank
    @NotEmpty
    private String email;
    @NotNull
    @NotBlank
    @NotEmpty
    private String birthDate;
    @NotNull
    @NotBlank
    @NotEmpty
    private String address;
}
