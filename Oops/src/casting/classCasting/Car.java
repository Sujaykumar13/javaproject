package casting.classCasting;

public class Car extends Vehicle{
    public int noOfseats=5;

    @Override
    public void run() {
        System.out.println("car can road off road");
    }

    @Override
    public void fuel() {
        System.out.println("car can run using diesel as fuel");
    }

    public void speed()
    {
        System.out.println("top speed of car is 300");
    }
}
