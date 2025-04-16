package com.xworks.controller;

import org.springframework.stereotype.Component;

@Component
public class StateImplim implements State {

    String stateName="Uttarkhand";

    @Override
    public void state() {
        System.out.println("this is utarkhand state");

    }
}
