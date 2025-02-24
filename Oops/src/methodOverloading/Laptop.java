package methodOverloading;

public class Laptop {
    String brand;
    int price;
    int ram;

    public void lap(String brand)
    {
        this.brand=brand;
    }
    public void lap(int price,String brand)
    {
        this.brand=brand;
        this.price=price;
    }
    public void lap(String brand,int price)
    {
        this.price=price;
        this.brand=brand;
    }
    public void lap(int price,String message,int ram) {
        this.price = price;
        this.brand = brand;
        this.ram = ram;
    }
    public String getBrand()
    {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }
    public static void main(String[] args)
    {
        Laptop laptop=new Laptop();
        laptop.lap("dell");
        laptop.lap(40000,"hp");
        laptop.lap("lenovo",30000);
        laptop.lap(50000,"mac",32);
        System.out.println(laptop.getBrand());
        System.out.println(laptop.getPrice());
        System.out.println(laptop.getRam());
    }

}
