package com.registerpage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    private String orderName;

    @ManyToOne
    @JoinColumn(name = "person_Id",
    referencedColumnName = "personId")
    private Person person;

}
