package org.inhertance;

public class Square extends Shape {
    boolean allSideEqual;
    public void setEqualSide(boolean allSideEqualside)
    {
        this.allSideEqual=allSideEqual;
    }
    public boolean getEqualSide()
    {
        return allSideEqual;
    }
    public static void main(String[] args)
    {
        Square sq =new Square();
        sq.setSide(4);
        System.out.println(sq.getSide());
        sq.setArea(16);
        System.out.println(sq.getArea());
        sq.setDimension("2D");
        System.out.println(sq.getDimension());
        sq.setEqualSide(true);
        System.out.println(sq.getEqualSide());
    }
}
