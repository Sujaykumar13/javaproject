package MethodOverriding;

public class Animal {
    int noOfLegs;
    public Animal(int noOfLegs)
    {
        this.noOfLegs=noOfLegs;
        System.out.println("parent class");
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }
    public void type()
    {
        System.out.println("Animals are carnivorous,herbivorous and omnivorous");
    }
}
