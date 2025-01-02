package org.inhertance;

public class Shape2 {
    public int side;
    String name;
    protected int area;
    private boolean allSidesEqual;
    public void setEqual(boolean allSidesEqual)
    {
        this.allSidesEqual=allSidesEqual;
    }
    public boolean getEqual()
    {
        return allSidesEqual;
    }
    private void area()
    {
        area=side*side;
    }
    void name()
    {
      System.out.println("it is a square");
    }
    protected void length()
    {
        System.out.println("length is equal for each side");
    }


}
