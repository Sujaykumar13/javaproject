package com.registerpage.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RegisterDto {

    private int id;

    @NotEmpty(message = "Enter first name")
    @NotBlank(message = "Enter first name")
    @NotNull(message = "Enter first name")
    private String firstName;

    @NotEmpty(message = "Enter last name")
    @NotBlank(message = "Enter last name")
    @NotNull(message = "Enter last name")
    private String lastName;

    @NotEmpty(message = "Enter parent name")
    @NotBlank(message = "Enter parent name")
    @NotNull(message = "Enter parent name")
    private String parentName;

//    @NotEmpty(message = "Enter number")
//    @NotBlank(message = "Enter number")
//    @NotNull(message = "Enter number")
//    @Size(min = 10, max=10)
    private long contactNumber;

    @NotEmpty(message = "Enter birthdate")
    @NotBlank(message = "Enter birthdate")
    @NotNull(message = "Enter birthdate")
    private String birthDate;

    @NotEmpty(message = "Enter email")
    @NotBlank(message = "Enter email")
    @NotNull(message = "Enter email")
    private String email;

    @NotEmpty(message = "Enter password")
    @NotBlank(message = "Enter password")
    @NotNull(message = "Enter password")
    private String password;

    @NotEmpty(message = "Enter confirm password")
    @NotBlank(message = "Enter confirm password")
    @NotNull(message = "Enter confirm password")
    private String confirmPassword;
}
