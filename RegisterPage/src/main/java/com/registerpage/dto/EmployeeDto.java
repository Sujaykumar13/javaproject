package com.registerpage.dto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class EmployeeDto {


    private Integer employeeId;

    private String employeeName;

    private String department_id_list;
}
