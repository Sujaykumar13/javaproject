package org.inhertance;

public class Company {
    String companyName;
    String companyType;
    long turnOver;
    public void setName(String companyName)
    {
        this.companyName=companyName;
    }
    public String getName()
    {
        return companyName;
    }
    public void setType(String companyType)
    {
        this.companyType=companyType;
    }
    public String getType()
    {
        return companyType;
    }
    public void setTurn(long turnOver)
    {
        this.turnOver=turnOver;
    }
    public long getTurn()
    {
        return turnOver;
    }
    public void ceo()
    {
        System.out.println("ceo of the company is xyz");
    }
}
