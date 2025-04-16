package com.xworks.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Teachers {
    @Autowired
    Student student;

    public void attendence()
    {
        System.out.println("marks is "+student.minimumMarks);
    }
}

