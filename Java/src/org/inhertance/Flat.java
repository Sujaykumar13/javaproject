package org.inhertance;

public class Flat extends Apartment{
    String flatOwner;
    public Flat()
    {
        System.out.println("Non parametrized sub class constructor");
    }
    public Flat(String name,String dimension,String flatOwner)
    {
        super(name,dimension);
        this.flatOwner=flatOwner;
        System.out.println("Parametrized sub class constructor");
    }
    public String getFlatOwner()
    {
        return flatOwner;
    }
    public static void main(String[] args)
    {
        Flat flat = new Flat();
        Flat flat1= new Flat("xyz","15*20","jhk");
        Apartment apart = new Apartment();
        Apartment apart1 = new Apartment("ytr","1500*1200");
        System.out.println(flat1.getName());
        System.out.println(flat1.getDimension());
        System.out.println(flat1.getFlatOwner());
        System.out.println(apart1.getName());
        System.out.println(apart1.getDimension());
        apart1.setOwner("defr");
        System.out.println(apart1.getOwner());
    }
}


