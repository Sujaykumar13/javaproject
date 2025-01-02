package org.InheritanceTypes;

public class Development extends Company {
    String employeeName;
    int noDevelopmentTeam;
    public Development(int companyId,String  companyName,String employeeName)
    {
        super(companyId,companyName);
        this.employeeName=employeeName;

    }
    public String getEmployeeName()
    {
        return employeeName;
    }
    public void setNoDevelopmentTeam(int noDevelopmentTeam)
    {
       this.noDevelopmentTeam=noDevelopmentTeam;
    }
    public int getNoDevelopmentTeam()
    {
        return noDevelopmentTeam;
    }
    public static void main(String[] args)
    {
        Development dev=new Development(2645,"infosys","sujay");
        System.out.println(dev.getCompanyId());
        System.out.println(dev.getCompanyName());
        System.out.println(dev.getEmployeeName());
        dev.setNoDevelopmentTeam(10);
        System.out.println(dev.getNoDevelopmentTeam());
    }
}
