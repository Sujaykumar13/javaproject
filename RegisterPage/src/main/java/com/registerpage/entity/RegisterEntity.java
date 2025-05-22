package com.registerpage.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="register_info")
@NamedQuery(name="fetch",query="select e from RegisterEntity e")
@NamedQuery(name="findById",query="select e from RegisterEntity e where id=:id")
@NamedQuery(name="findByEmail",query="select e from RegisterEntity e where email=:email")
@NamedQuery(name="delete" ,query="delete from RegisterEntity where id=:id")
public class RegisterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="parent_name")
    private String parentName;

    @Column(name="contact_number")
    private long contactNumber;

    @Column(name = "birth_date")
    private String birthDate;

    @Column(name = "email")
    private String email;

    @Column (name = "password")
    private String password;

    @Column(name = "confirm_password")
    private String confirmPassword;
}
