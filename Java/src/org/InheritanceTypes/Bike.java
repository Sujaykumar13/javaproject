package org.InheritanceTypes;

public class Bike extends Vehicle{
    int gears;
    public Bike()
    {
        System.out.println("it is bike class constructor");
    }

    public void setGears(int gears) {
        this.gears = gears;
    }
    public int getGears()
    {
        return gears;
    }
    protected void seats()
    {
        System.out.println("bike as only two seats");
    }
}
