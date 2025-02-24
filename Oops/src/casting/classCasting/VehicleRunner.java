package casting.classCasting;

public class VehicleRunner {
    public static void main(String[] args)
    {
        System.out.println("upcasting=============");
        Vehicle vehicle = new Bike();
        vehicle.fuel();
        vehicle.run();

        System.out.println("downcasting=============");
        if(vehicle instanceof Bike)
        {
            Bike bike= (Bike) vehicle;//explicit casting
            System.out.println(bike.noOfSeats);
            bike.run();
            bike.speed();
            bike.fuel();
        }

        if(vehicle instanceof Car)
        {
            Car car= (Car) vehicle;
            System.out.println(car.noOfseats);
            car.run();
            car.fuel();
            car.speed();
        }
    }
}
