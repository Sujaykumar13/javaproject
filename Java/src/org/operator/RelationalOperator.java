package org.operator;

public class RelationalOperator {
    public static void main(String[] args)
    {
        int marks=80;
        char grade='O';
        if(marks>=90)
        {
            grade='A';
        }
        if(marks>=80 && marks<90)
        {
            grade='B';
        }
        if(marks>=70 && marks<80)
        {
            grade='C';
        }
        if(marks>60 && marks<70)
        {
            grade='D';
        }
        if(marks<=60)
        {
            grade='E';
        }
        System.out.println(grade);
    }

}
