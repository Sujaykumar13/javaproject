package com.threads;

public class Student extends Thread{//creating thread by extending thread

    @Override
    public void run() {
        for(int i=0;i<100;i++) {
            System.out.println("student number is "+i+ " and this is in Thread " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Student student=new Student();
        student.run();
        student.start();

        Student student1=new Student();
        student1.start();
    }
}
