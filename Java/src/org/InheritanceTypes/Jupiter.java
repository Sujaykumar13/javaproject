package org.InheritanceTypes;

public class Jupiter extends SolarSystem{
    boolean humansPresent;
    boolean oxygen;
    public Jupiter(boolean blackHole,String noOfGalxies,int noOfPlanets,int noOfSuns,boolean humansPresent)
    {
        super(blackHole,noOfGalxies,noOfPlanets,noOfSuns);
        this.humansPresent=humansPresent;
    }

    public void setOxygen(boolean oxygen) {
        this.oxygen = oxygen;
    }

    public boolean getOxygen() {
        return oxygen;
    }

    public boolean isHumansPresent() {
        return humansPresent;
    }

    public static void main(String[] args)
    {
        Jupiter jupiter = new Jupiter(true,"2M",9,1,false);
        System.out.println(jupiter.getBlackHole());
        System.out.println(jupiter.getNoOfGalaxies());
        System.out.println(jupiter.getNoOfPlanets());
        System.out.println(jupiter.getNoOfsuns());
        System.out.println(jupiter.isHumansPresent());
        jupiter.setSolarName("gjyt");
        System.out.println(jupiter.getSolarName());
        jupiter.setOxygen(false);
        System.out.println(jupiter.getOxygen());
        jupiter.setName("milkyway");
        System.out.println(jupiter.getName());
        Earth earth = new Earth(true,"2M",9,1,1);
        System.out.println(earth.getBlackHole());
        System.out.println(earth.getNoOfGalaxies());
        System.out.println(earth.getNoOfPlanets());
        System.out.println(earth.getNoOfsuns());//System.out.println(earth.getNoOfMoon());
        earth.setSolarName("gjyt");
        System.out.println(earth.getSolarName());
        earth.setHumansPresent(true);
        System.out.println(earth.getHumansPresent());
        earth.setName("milkyway");
        System.out.println(earth.getName());
    }
}
