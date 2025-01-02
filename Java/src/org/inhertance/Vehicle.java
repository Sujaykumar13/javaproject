package org.inhertance;

public class Vehicle {
    String vehicleBrand;
    String vehicleColor;
    int price;
    public void setBrand(String vehicleBrand)
    {
        this.vehicleBrand=vehicleBrand;
    }
    public String getBrand()
    {
        return vehicleBrand;
    }
    public void setColor(String vehicleColor)
    {
        this.vehicleColor=vehicleColor;
    }
    public String getColor()
    {
        return vehicleColor;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
    public int getPrice()
    {
        return price;
    }
    public void start()
    {
        System.out.println("vehicle can start");
    }
}
