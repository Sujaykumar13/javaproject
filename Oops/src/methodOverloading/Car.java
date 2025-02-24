package methodOverloading;

public class Car {
    String brand;
    int price;
    String type;
    public void carFeature(String brand)
    {
        this.brand=brand;
    }
    public void carFeature(int price,String type)
    {
        this.price=price;
        this.type=type;
    }
    public void carFeature(String brand,int price,String type)
    {
        this.brand=brand;
        this.price=price;
        this.type=type;
    }
    public String getBrand()
    {
        return brand;
    }
    public String getType()
    {
        return type;
    }

    public int getPrice() {
        return price;
    }
    public static void main(String[] args)
    {
        Car car=new Car();
        car.carFeature("audi");
        car.carFeature(5000000,"audi");
        car.carFeature("benz",6000000,"sedan");
        System.out.println(car.getBrand());
        System.out.println(car.getPrice());
        System.out.println(car.getType());

    }
}
