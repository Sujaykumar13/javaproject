package MethodOverriding;

public class Lion extends Animal{
    int noOfEyes;
    public Lion(int noOfLegs,int noOfEyes)
    {
        super(noOfLegs);
        this.noOfEyes=noOfEyes;
        System.out.println("child class");
    }

    public int getNoOfEyes() {
        return noOfEyes;
    }
    public void type()
    {
        System.out.println("Lion is carnivorous");
    }
    public static void main(String[] args)
    {
        Lion lion = new Lion(4,2);
        lion.getNoOfEyes();
        lion.getNoOfLegs();
        lion.type();
    }
}
