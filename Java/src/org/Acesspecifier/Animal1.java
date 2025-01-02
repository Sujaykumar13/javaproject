package org.Acesspecifier;

public class Animal1 {
    String animalType;
    protected static String animalColor;
    private int noOfLegs;
    static final float constant=2;//final should be initialized, if not initialize it will throw error
    final int side=1;
    public String loc;

    public void setLegs(int noOfLegs) 
    {
        this.noOfLegs=noOfLegs;
    }
    public int getNoOfLegs()
    {
        return noOfLegs;
    }
    private void type()
    {
        System.out.println("tiger is a carnivorous animal");
    }
    public static final void constant(int constant1)
    {
        //constant=constant1;we not able assign value for final
        System.out.println("it is static final method");
    }
    public final void setSide(int side)
    {
        //this.side=side;we not able assign value for this
        System.out.println("it is non static final method");
    }
    public static void setColor(String animalColor)
    {
       animalColor=animalColor;//this is only appilcable for instance of obejct
    }
    public static String getColor()
    {
        return animalColor;//we not able return non static variable using static method
    }
    void location()
    {
        System.out.println("Animals are in zooo");
    }
    protected void animalEyeColor()
    {
        System.out.println("Color of animal eye is black");
    }

}
