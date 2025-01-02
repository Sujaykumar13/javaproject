package org.InheritanceTypes;

public class SolarSystem extends Galaxy{
    int noOfPlanets;
    int noOfsuns;
    String solarName;
    public SolarSystem(boolean blackHole,String noOfGalxies,int noOfPlanets,int noOfsuns)
    {
        super(blackHole,noOfGalxies);
        System.out.println("solar system constructor");
        this.noOfPlanets=noOfPlanets;
        this.noOfsuns=noOfsuns;
    }

    public int getNoOfPlanets() {
        return noOfPlanets;
    }

    public int getNoOfsuns() {
        return noOfsuns;
    }

    public void setSolarName(String solarName) {
        this.solarName = solarName;
    }
    public String getSolarName()
    {
        return solarName;
    }
}
