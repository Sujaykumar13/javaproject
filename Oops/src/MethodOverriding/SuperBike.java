package MethodOverriding;

public class SuperBike extends Bike {
    String bikeName;
    int speed;
    public SuperBike(String bikeName1,int speed1,String bikeName,int speed)
    {
        super(bikeName1,speed1);
        System.out.println("child class");
        this.bikeName=bikeName;
        this.speed=speed;
    }

    public String getBikeName() {
        return bikeName;
    }

    public int getSpeed() {
        return speed;
    }
    public static void main(String[] args)
    {
        SuperBike bike = new SuperBike("suzuki",100,"suzuki hazabuza",300);
        System.out.println(bike.getBikeName());
        System.out.println(bike.getSpeed());
    }
}
