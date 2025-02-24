package array;

public class Laptop {
    private String brand;
    private int price;
    private int ram;
    private int battery;
    public Laptop(String brand,int price,int ram,int battery)
    {
        this.brand=brand;
        this.price=price;
        this.ram=ram;
        this.battery=battery;
    }
    public void setRam(int ram)
    {
        this.ram=ram;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public int getBattery() {
        return battery;
    }

    @Override
    public String toString() {
        return "laptop brand-"+brand+"price-"+price+"ram-"+ram+"battery-"+battery;
    }
}
