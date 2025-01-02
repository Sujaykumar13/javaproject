package org.inhertance;

public class Rectangle extends Shape1{
    boolean allSideEqual;
    public Rectangle()
    {
        System.out.println("Non parametrized sub class constructor");
    }
    public Rectangle(int noOfSide,int area,boolean allSideEqual)
    {
        super(noOfSide,area);
        this.allSideEqual=allSideEqual;
        System.out.println("Parametrized sub class constructor");
    }
    public boolean getEqual()
    {
        return allSideEqual;
    }
    public static void main(String[] args)
    {
        Rectangle rect= new Rectangle();
        Rectangle rect1= new Rectangle(4,50,false);
        Shape1 shape=new Shape1();
        System.out.println(rect1.getSide());
        System.out.println(rect1.getArea());
        System.out.println(rect1.getEqual());
        System.out.println(rect1.getSide());
        System.out.println(rect1.getArea());
        rect1.setDimension("2D");
        System.out.println(rect1.getDimension());
    }
}
