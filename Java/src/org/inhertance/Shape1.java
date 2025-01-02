package org.inhertance;

  class Shape1 {
    int  noOfSide;
    int  area;
    String dimension;
    public Shape1()
    {
        System.out.println("Non parameterised super class constructor");
    }
    public Shape1(int noOfSide,int area)
    {
        this();
        System.out.println("Parameterised super class constructor");
        this.noOfSide=noOfSide;
        this.area=area;
    }
    public int getSide()
    {
        return noOfSide;
    }
    public int getArea()
    {
        return area;
    }
    public void setDimension(String dimension)
    {
        this.dimension=dimension;
    }
    public String getDimension()
    {
        return dimension;
    }
}
