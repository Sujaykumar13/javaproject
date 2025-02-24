package org.inhertance;

public class Lion extends Animal{
    public void sound()
    {
        System.out.println("lion roa" +
                "r");
    }
    public static void main(String[] args)
    {
        Animal ani =new Animal();
        ani.setType("carnivorous");
        System.out.println(ani.getType());
        ani.setColor("brown");
        Lion lio=new Lion();
        lio.setType("carnivorous");
        System.out.println(lio.getType());
        lio.setColor("brown");
        System.out.println(lio.getColor());
        lio.setLegs(4);
        System.out.println(lio.getNoOfLegs());
        lio.walking();
        lio.sound();
    }


}
