package org.inhertance;

public class Department1 extends Company1{
    String manager;
    public Department1()
    {
        System.out.println("Non parametrized sub class constructor");
    }
    public Department1(String name,long turnOver,String manager)
    {
        super(name,turnOver);
        this.manager=manager;
        System.out.println("Parametrized sub class constructor");
    }
    public String getManager()
    {
        return manager;
    }
    public static void main(String[] args)
    {
       Department1 dept = new Department1();
        Department1 dept1= new Department1("development",2000000,"xyz");
        Company1 comp= new Company1("apple",564132364);
        System.out.println(dept1.getName());
        System.out.println(dept1.getTurn());
        System.out.println(dept1.getManager());
        System.out.println(comp.getName());
        System.out.println(comp.getTurn());
        comp.setCeo("vhui");
        System.out.println(comp.getCeo());
    }

}
