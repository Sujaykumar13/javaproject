package com.xworks.spring;

import org.springframework.stereotype.Component;

@Component
public class Lion {

    String animal="lion";
    public void sound()
    {
        System.out.println("Lion roar");
    }
}
