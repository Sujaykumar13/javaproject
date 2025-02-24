package objectClass;

public class BikeRunner {
    public static void main(String[] args)
    {
        Bike bike1=new Bike(2653,"sports");
        System.out.println(bike1.toString());
        System.out.println(bike1.hashCode());

        Bike bike2=new Bike(2655,"crusier");
        System.out.println(bike2.toString());
        System.out.println(bike2.hashCode());

        Bike bike3=new Bike(2653,"sports");
        System.out.println(bike3.toString());
        System.out.println(bike3.hashCode());
        System.out.println(bike1==bike2);
        System.out.println(bike1.equals(bike3));
        System.out.println(bike1.equals(bike2));


    }
}
