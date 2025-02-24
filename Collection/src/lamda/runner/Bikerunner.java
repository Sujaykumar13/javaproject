package lamda.runner;

import lamda.inter.Bike;

public class Bikerunner {
    public static void main(String[] args)
    {
        Bike bike = (int a)-> a;
        int result = bike.milage(18);
        System.out.println(result);
    }
}
