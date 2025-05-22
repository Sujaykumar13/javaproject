package com.modules.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="registration_information")
@NamedQuery(name="findByMobileNumber",query="select e from RegistrationEntity e where e.contactNumber=:contactNumber")
@NamedQuery(name="findByEmail",query="select e from RegistrationEntity e where e.emailId=:email")
public class RegistrationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email_id")
    private  String emailId;
    @Column(name = "contact_number")
    private  long contactNumber;
    private  String city;
    private String gender;
    private String password;

    @Column(name = "no_of_atempts")
    private int noOfAtempts=0;

    @Column(name = "isEnabled")
    private boolean isEnabled=true;

    private String otp="000000";

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "content_type")
    private String contentType;
}
