package org.inhertance;

public class Car extends Vehicle{
    public void speed()
    {
        System.out.println("top speed of car is 350");
    }
    public static void main(String[] args)
    {
        Vehicle vehicle =new Vehicle();
        vehicle.setBrand("BMW");
        System.out.println(vehicle.getBrand());
        vehicle.setColor("white");
        System.out.println(vehicle.getColor());
        Car car=new Car();
        car.setBrand("Audi");
        System.out.println(car.getBrand());
        car.setColor("black");
        System.out.println(car.getColor());
        car.setPrice(50000000);
        System.out.println(car.getPrice());
        car.speed();
        car.start();
    }
}
