package org.InheritanceTypes;

public class Earth extends SolarSystem{
    boolean humansPresent;
    int noOfMoon;
    public Earth(boolean blackHole,String noOfGalxies,int noOfPlanets,int noOfSuns,int noOfMoon)
    {
        super(blackHole,noOfGalxies,noOfPlanets,noOfSuns);
        System.out.println("earth construtor");
        this.noOfMoon=noOfMoon;
    }

    public void setHumansPresent(boolean humansPresent) {
        this.humansPresent = humansPresent;
    }

    public boolean getHumansPresent() {
        return humansPresent;
    }

    public int getNoOfMoon() {
        return noOfMoon;
    }

    public static void main(String[] args)
    {
      Earth earth = new Earth(true,"2M",9,1,1);
      System.out.println(earth.getBlackHole());
        System.out.println(earth.getNoOfGalaxies());
        System.out.println(earth.getNoOfPlanets());
        System.out.println(earth.getNoOfsuns());
        System.out.println(earth.getNoOfMoon());
        earth.setSolarName("gjyt");
        System.out.println(earth.getSolarName());
        earth.setHumansPresent(true);
        System.out.println(earth.getHumansPresent());
        earth.setName("milkyway");
        System.out.println(earth.getName());
    }

}
