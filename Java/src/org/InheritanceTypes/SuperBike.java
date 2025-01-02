package org.InheritanceTypes;

public class SuperBike extends Bike{
    public int topSpeed;
    public SuperBike(int topSpeed)
    {
        System.out.println("it is superbike class constructor");
        this.topSpeed=topSpeed;
    }
    public int getTopSpeed()
    {
        return topSpeed;
    }

    public void legal() {
        System.out.println("super bikes is legal to ride in road");
    }
    public static void main(String[] args)
    {
        SuperBike bike = new SuperBike(300);
        System.out.println(bike.getTopSpeed());
        bike.legal();
        bike.setGears(6);
        System.out.println(bike.getGears());
        bike.seats();
        bike.setEngineNumber(564987312);
        System.out.println(bike.getEngineNumber());
        bike.setBrand("suzuki");
        System.out.println(bike.getBrand());

    }
}
