package com.xworks.logical_program;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int num ;
        Scanner sc = new  Scanner ( System .in ) ;
        System.out.println("Enter the number : ");
        num = sc . nextInt ( ) ;
//        int num=163;
        int sum=0;
        int n=num;
        while(n!=0)
        {
            int rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        if(num==sum)
        {
            System.out.println("number is armstrong number "+num);
        }

        else {
            System.out.println("number is not armstrong number "+num);
        }
    }
}
