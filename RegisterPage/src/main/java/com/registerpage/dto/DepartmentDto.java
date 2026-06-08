package com.registerpage.dto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class DepartmentDto {

    private Integer departmentId;

    private String departmentName;
}
