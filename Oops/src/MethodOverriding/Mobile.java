package MethodOverriding;

public class Mobile {
    String brand;
    int price;
    public Mobile(String brand,int price)
    {
        this.brand=brand;
        this.price=price;
        System.out.println("parent class");
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }
    public void camera()
    {
        System.out.println("mobile as dual camera with 48MP");
    }
}
