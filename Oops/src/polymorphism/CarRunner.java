package polymorphism;

public class CarRunner {
    public static void main(String[] args)
    {
        Car car=new Car();
        car.carFeature("Jaquar");
        car.carFeature(1000000000,"Sedan");
        car.carFeature("Benz",20000000,"xuv");
    }
}
