package casting.classCasting;

public class Bike extends Vehicle{
    public int noOfSeats=2;

    @Override
    public void fuel() {
        System.out.println("bike run using petrol as fuel");
    }

    @Override
    public void run() {
        System.out.println("Bike run off road or on road");
    }

    public void speed()
    {
        System.out.println("top speed of bike is 200");
    }
}
