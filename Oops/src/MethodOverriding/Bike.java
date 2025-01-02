package MethodOverriding;

public class Bike {
    String bikeName;
    int speed;
    public Bike(String bikeName,int speed)
    {
        System.out.println("parent class");
        this.bikeName=bikeName;
        this.speed=speed;
    }

    public String getBikeName() {
        return bikeName;
    }

    public int getSpeed() {
        return speed;
    }
}
