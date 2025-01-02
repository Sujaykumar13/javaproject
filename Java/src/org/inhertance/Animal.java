package org.inhertance;

public class Animal {
    String animalType;
    String animalColor;
    int noOfLegs;
    public void setType(String animalType)
    {
        this.animalType=animalType;
    }
    public String getType()
    {
        return animalType;
    }
    public void setColor(String animalColor)
    {
        this.animalColor=animalColor;
    }
    public String getColor()
    {
        return animalColor;
    }
    public void setLegs(int noOfLegs)
    {
        this.noOfLegs=noOfLegs;
    }
    public int getNoOfLegs()
    {
        return noOfLegs;
    }
    public void walking()
    {
        System.out.println("animal can walk");
    }

}
