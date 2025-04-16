package com.xworks.spring.entity;

import lombok.Data;

import javax.persistence.*;

@Data

@Entity
@Table(name = "student_info")
public class StudentEntity {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "student_name")
    private String studentName;
    @Column(name = "parent_name")
    private String parentName;
    @Column(name = "age")
    private String age;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "email")
    private String email;
    @Column(name = "birth_date")
    private String birthDate;
    @Column(name = "address")
    private String address;
 @Column(name = "gender")
    private String gender;
 @Column(name = "combination")
    private String combination;
}
