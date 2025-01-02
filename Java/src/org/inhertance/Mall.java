package org.inhertance;

public class Mall {
    String mallName;
    String mallType;
    int dimension;
    public void setName(String mallName)
    {
        this.mallName=mallName;
    }
    public String getName()
    {
        return mallName;
    }
    public void setType(String mallType)
    {
        this.mallType=mallType;
    }
    public String gettype()
    {
        return mallType;
    }
    public void setDimension(int dimension)
    {
        this.dimension=dimension;
    }
    public int getDimension()
    {
        return dimension;
    }
    public void opening()
    {
        System.out.println("mall open at 10");
    }
}
