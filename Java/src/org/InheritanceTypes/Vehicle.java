package org.InheritanceTypes;

public class Vehicle {
    private long engineNumber;
    protected String brand;
    public Vehicle()
    {
        System.out.println("it is vehicle class constructor");
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand()
    {
        return brand;
    }

    public void setEngineNumber(long engineNumber) {
        this.engineNumber = engineNumber;
    }

    public long getEngineNumber() {
        return engineNumber;
    }
}
