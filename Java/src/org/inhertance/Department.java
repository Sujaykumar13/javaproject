package org.inhertance;

public class Department extends Company{
    public void manager()
    {
        System.out.println("manager of department is xyz");
    }
    public static void main(String[] args)
    {
        Company comp =new Company();
        comp.setName("Google");
        System.out.println(comp.getName());
        Department dept =new Department();
        dept.setName("Development");
        System.out.println(dept.getName());
        dept.setType("product base");
        System.out.println(dept.getType());
        dept.setTurn(2000000000);
        System.out.println(dept.getTurn());
        dept.manager();
        dept.ceo();
    }

}
