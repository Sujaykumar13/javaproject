package com.registerpage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.engine.profile.Fetch;

import javax.persistence.*;

@Entity
@Data

public class EmployeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;

    private String employeeName;

    private String department_id_list;


    @ManyToOne(fetch = FetchType.LAZY)
    private DepartmentEntity departmentEntity;



}
