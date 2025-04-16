package com.xworks.spring;

import org.springframework.stereotype.Component;

@Component
public class Mall {

    Addidas adidas;

    public Mall(Addidas adidas) {//for constructor dependency injection we may or may not mention @Autowired
        //and autowired is not compulsory for construtor ijection but compulsory for field and setter injection
        this.adidas = adidas;
    }

    public void location()
    {
        System.out.println("bangalore location and the mall is "+adidas.brand);
    }
}
 