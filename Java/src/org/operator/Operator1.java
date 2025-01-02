package org.operator;

public class Operator1 {
    public static void main(String[] args)
    {
        boolean atmisopen = false;
        int atmopentime = 8;
        boolean bankopen =false;
        if(atmisopen == true && atmopentime < 10)
        {
            System.out.println("cash available in atm");
        }
        else if (bankopen ==true)
        {
            System.out.println("cash available in bank");
        }
        else
        {
            System.out.println("cash not available");
        }
    }
}
