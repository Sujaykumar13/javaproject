package org.inhertance;

public class Apartment {
    String name;
    String dimension;
    String owner;
    public Apartment()
    {
        System.out.println("Non parameterised super class constructor");
    }
    public Apartment(String name,String dimension)
    {
        this();
        System.out.println("Parameterised super class constructor");
        this.name=name;
        this.dimension=dimension;

    }
    public String getName()
    {
        return name;
    }
    public String getDimension()
    {
        return dimension;
    }
    public void setOwner(String owner)
    {
        this.owner=owner;
    }
    public String getOwner()
    {
        return owner;
    }
}
