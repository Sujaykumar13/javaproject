package polymorphism;

public class Car {
    String brand;
    int price;
    String type;

    public void carFeature(String brand)
    {
        this.brand=brand;
        System.out.println("car brand is "+brand);
    }

    public void carFeature(int price,String type)
    {
        this.price=price;
        this.type=type;
        System.out.println("car price is "+price);
        System.out.println("car type is "+type);
    }

    public void carFeature(String brand,int price,String type)
    {
        this.brand=brand;
        this.price=price;
        this.type=type;
        System.out.println("car brand is "+brand);
        System.out.println("car price is "+price);
        System.out.println("car type is "+type);
    }
}
