package com.xworks.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {

        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(ConfigClass.class);
        College college = applicationContext.getBean(College.class);
        college.principle();
        Teachers teacher = applicationContext.getBean(Teachers.class);
        teacher.attendence();
        Student student = applicationContext.getBean(Student.class);
        student.marks();

    }
}
