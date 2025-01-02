package org.inhertance;

public class Father {
    String color;
    String property;
    int age;
    public Father()
    {
        System.out.println("Non parameterised super class constructor");
    }
    public Father(String color,String property)
    {
        this();
        System.out.println("Parameterised super class constructor");
        this.color=color;
        this.property=property;

    }
    public String getColor()
    {
        return color;
    }
    public String getProperty()
    {
        return property;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }
}
