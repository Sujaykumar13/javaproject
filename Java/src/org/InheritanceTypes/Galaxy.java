package org.InheritanceTypes;

public class Galaxy {
    boolean blackHole;
    String noOfGalaxies;
    String name;
    public Galaxy(boolean blackHole,String noOfGalaxies)
    {
        System.out.println("galaxy constructor");
        this.blackHole=blackHole;
        this.noOfGalaxies=noOfGalaxies;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public boolean getBlackHole() {
        return blackHole;
    }

    public String getNoOfGalaxies() {
        return noOfGalaxies;
    }

    public String getName() {
        return name;
    }
}
