package com.registerpage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NamedQuery(name="fetchById",query="select e.employeEntityList from DepartmentEntity e where departmentId=:id")
public class DepartmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer departmentId;

    private String departmentName;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id_list",
    referencedColumnName = "departmentId"
    )
    private List<EmployeEntity> employeEntityList;
}
