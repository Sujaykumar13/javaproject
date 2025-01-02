package org.inhertance;

public class Shape {
    int  noOfSide;
    int  area;
    String dimension;
    public void setSide(int noOfSide)
    {
        this.noOfSide=noOfSide;
    }
    public int getSide()
    {
        return noOfSide;
    }
    public void setArea(int area)
    {
        this.area=area;
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
