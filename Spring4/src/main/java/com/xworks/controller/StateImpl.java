package com.xworks.controller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component//in interface implemnets we need to mention @component in implimentsclass not in interface
@Primary//when interface as Two or more implement class than we need to give primary priority for the class which we need to create object
public class StateImpl implements State{
    String stateName="karnataka";
    @Override
    public void state() {
        System.out.println("state name is karnataka");
    }
}
