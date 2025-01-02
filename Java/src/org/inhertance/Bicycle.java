package org.inhertance;

public class Bicycle {
    int gear;
    int speed;
    public Bicycle()
    {
        //we have default super() for object class
        System.out.println("Non parameterised super class constructor");
    }
    public Bicycle(int gear,int speed)
    {
        this();
        System.out.println("Parameterised super class constructor");
        this.gear=gear;
        this.speed=speed;

    }
    public int getGear()
    {
        return gear;
    }
    public int getSpeed()
    {
        return speed;
    }
    public void setIncrement(int increment)
    {
        speed=speed+increment;
    }
    public void setDecrement(int decrement)
    {
        speed=speed-decrement;
    }



}
