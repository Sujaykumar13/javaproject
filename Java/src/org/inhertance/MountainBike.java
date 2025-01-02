package org.inhertance;

public class MountainBike extends Bicycle {
    int seatHeight;
    public MountainBike()
    {
        //in inheritance there is default super() so we get print of superclass constructor
        System.out.println("Non parametrized sub class constructor");
    }
    public MountainBike(int gear,int speed,int seatHeight)
    {
        super(gear,speed);
        this.seatHeight=seatHeight;
        System.out.println("Parametrized sub class constructor");
    }
    public int getSeatHeight()
    {
        return seatHeight;
    }
    public static void main(String[] args)
    {
        MountainBike bike=new MountainBike();
        MountainBike bike1=new MountainBike(5,150,10);
        Bicycle cyc = new Bicycle();// in super class we not able extends property methods constructor of sub class
        Bicycle cyc1 = new Bicycle(6,90);
        System.out.println(bike1.getGear());
        System.out.println(bike1.getSpeed());
        System.out.println(bike1.getSeatHeight());
        System.out.println(cyc1.getGear());
        System.out.println(cyc1.getSpeed());
        bike1.setIncrement(20);
        System.out.println(bike1.getSpeed());
        bike1.setDecrement(20);
        System.out.println(bike1.getSpeed());
        cyc1.setDecrement(20);
        System.out.println(cyc1.getSpeed());
    }
}
