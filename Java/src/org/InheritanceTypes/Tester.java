package org.InheritanceTypes;

public class Tester extends Company{
    String testProjectName;
    int buildNo;
    public Tester(int companyId,String companyName,String testProjectName)
    {
        super(companyId,companyName);
        this.testProjectName=testProjectName;
    }
    public void setBuildNo(int buildNo)
    {
        this.buildNo=buildNo;
    }
    public String getTestProjectName()
    {
        return testProjectName;
    }
    public int getBuildNo()
    {
        return buildNo;
    }
    public static void main(String[] args)
    {
        Tester test= new Tester(2656,"infosys","kemai");
        System.out.println(test.getCompanyId());
        System.out.println(test.getCompanyName());
        System.out.println(test.getTestProjectName());
        test.setBuildNo(56);
        System.out.println(test.getBuildNo());
    }


}
