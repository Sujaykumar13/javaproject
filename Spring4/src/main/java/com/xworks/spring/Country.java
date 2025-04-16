package com.xworks.spring;

import com.xworks.controller.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Country {
    @Autowired
    @Qualifier("stateImplim")//we can use qualifer instead of primary in qualifier we need to mention object refference name
    //when we mention both primary and qualifier first priority is for qualifier
    State state;

    public void countryName() {
        state.state();
        System.out.println("this is india and as a state");
    }
}
