package com.xworks.spring.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class StudentDto {

    private Integer id;
    @NotNull(message = "field is blank")
    @NotBlank(message = "field is blank")
    @NotEmpty(message = "field is blank")
    private String studentName;
    @NotNull(message = "field is blank")
    @NotBlank(message = "field is blank")
    @NotEmpty(message = "field is blank")
    private String parentName;
    @NotNull(message = "field is blank")
    @NotBlank(message = "field is blank")
    @NotEmpty(message = "field is blank")
    @Size(min=2)
    private String age;
    @NotNull(message = "field is blank")
    @NotBlank(message = "field is blank")
    @NotEmpty(message = "field is blank")
    @Size(min=10)
    private String phoneNumber;
    @NotNull(message = "field is blank")
    @NotBlank(message = "field is blank")
    @NotEmpty(message = "field is blank")
    private String email;
    @NotNull(message = "field is blank")
    @NotBlank(message = "field is blank")
    @NotEmpty(message = "field is blank")
    private String birthDate;
    @NotNull(message = "field is blank")
    @NotBlank(message = "field is blank")
    @NotEmpty(message = "field is blank")
    private String address;
    @NotNull(message = "field is blank")
    @NotBlank(message = "field is blank")
    @NotEmpty(message = "field is blank")
    private String gender;
    @NotNull(message = "field is blank")
    @NotBlank(message = "field is blank")
    @NotEmpty(message = "field is blank")
    private String combination;
}
