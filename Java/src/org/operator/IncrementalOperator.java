package org.operator;

public class IncrementalOperator {
    public static void main(String[] args)
    {
        int gear=0;
        System.out.println(gear);
        gear +=5;
        System.out.println(gear);
        gear-=2;
        System.out.println(gear);
        gear++;
        System.out.println(gear);
        --gear;
        System.out.println(gear);
    }
}
