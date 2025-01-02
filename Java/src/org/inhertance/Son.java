package org.inhertance;

public class Son extends Father {
    String qualification;
    public Son()
    {
        System.out.println("Non parametrized sub class constructor");
    }
    public Son(String color,String property,String qualification)
    {
        super(color,property);
        this.qualification=qualification;
        System.out.println("Parametrized sub class constructor");
    }
    public String getQualification()
    {
        return qualification;
    }
    public static void main(String[] args)
    {
        Son son = new Son();
        Son son1 = new Son("brown","5 acre","masters");
        Father father = new Father("white","5 acre");
        System.out.println(son1.getColor());
        System.out.println(son1.getProperty());
        System.out.println(son1.getQualification());
        System.out.println(father.getColor());
        System.out.println(father.getProperty());
        father.setAge(50);
        System.out.println(father.getAge());
    }
}
