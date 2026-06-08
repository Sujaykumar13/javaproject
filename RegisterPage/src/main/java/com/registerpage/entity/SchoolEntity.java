package com.registerpage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
@AllArgsConstructor
public class SchoolEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer schoolId;

    private String schoolName;


}
