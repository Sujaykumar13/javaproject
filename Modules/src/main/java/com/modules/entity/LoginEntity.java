package com.modules.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "log_in_details")
@NamedQuery(name="findloginDetails",query="select e from LoginEntity e where e.emailId=:email")
public class LoginEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "email_id")
    private  String emailId;

    @Column(name="log_in_time")
    private  String logInTime;

    @Column(name = "log_in_date")
    private String logInDate;

    @Column(name = "logout_time")
    private String logOutTime="000000";

//    @Column(name = "no_of_atempts")
//    private int noOfAtempts;
//
//    @Column(name = "isEnabled")
//    private boolean isEnabled;
}
