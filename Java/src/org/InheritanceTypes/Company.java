package org.InheritanceTypes;

public class Company {
    int companyId;
    String companyName;
    public Company(int companyId,String companyName)
    {
        System.out.println("Company constructor");
        this.companyId=companyId;
        this.companyName=companyName;
    }
    public int getCompanyId()
    {
        return companyId;
    }
    public String getCompanyName()
    {
        return companyName;
    }
    void location()
    {
        System.out.println("company situated in bangalore");
    }
}
