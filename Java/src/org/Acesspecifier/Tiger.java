package org.Acesspecifier;

import org.inhertance.Shape2;

public class Tiger extends Animal1 {
    public static void main(String[] args)
    {
        Tiger tiger = new Tiger();
        System.out.println("-------from same package-------");
        tiger.setLegs(4);
        System.out.println(tiger.getNoOfLegs());//to access private variable
       // tiger.type(); not able access private method
        constant(2);
        tiger.setSide(4);
        setColor("white");
        System.out.println(getColor());
        tiger.location();//default method
        tiger.animalEyeColor();//protected method
        System.out.println(tiger.animalType);//default variable
        System.out.println(tiger.animalColor);//protected variable
        // System.out.println(tiger.noOfLegs);//private variable
        System.out.println(tiger.loc);//public variable
        //System.out.println("------from different pacakge-------");
        //tiger.setEqual(true);
        // System.out.println(tiger.getEqual());//private variable access from different package
        //tiger.area();not able to access private method of different package
        //tiger.name();not able to access default method of different package
        //tiger.length(); // protected method
        //System.out.println(tiger.side);//public variable
        //System.out.println(tiger.area);//protected variable
        //System.out.println(tiger.name);not able to access default variable
        //System.out.println(tiger.allSidesEqual);not able to access private variable

    }

}
