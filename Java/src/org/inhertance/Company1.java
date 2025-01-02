package org.inhertance;

public class Company1 {
    String companyName;
    long turnOver;
    String ceo;
    public Company1()
    {
        System.out.println("Non parameterised super class constructor");
    }
    public Company1(String companyName,long turnOver)
    {
        this();
        System.out.println("Parameterised super class constructor");
        this.companyName=companyName;
        this.turnOver=turnOver;

    }
    public String getName()
    {
        return companyName;
    }
    public long getTurn()
    {
        return turnOver;
    }
    public void setCeo(String ceo)
    {
        this.ceo=ceo;
    }
    public String getCeo()
    {
        return ceo;
    }
}
