package methodOverloading;

public class SolarSystem {
    int noOfPlanets;
    int noOfSuns;
    boolean human;

    public void solar(int noOfPlanets)
    {
        this.noOfPlanets=noOfPlanets;
    }
    public void solar(int noOfPlanets,int noOfSuns)
    {
        this.noOfPlanets=noOfPlanets;
        this.noOfSuns=noOfSuns;
    }
    public void solar(int noOfPlanets,int noOfSuns,boolean human)
    {
        this.noOfPlanets=noOfPlanets;
        this.noOfSuns=noOfSuns;
        this.human=human;
    }

    public int getNoOfPlanets() {
        return noOfPlanets;
    }

    public int getNoOfSuns() {
        return noOfSuns;
    }

    public boolean isHuman() {
        return human;
    }
    public static void main(String[] args)
    {
        SolarSystem system= new SolarSystem();
        system.solar(9);
        system.solar(9,1);
        system.solar(9,1,true);
        System.out.println(system.getNoOfPlanets());
        System.out.println(system.getNoOfSuns());
        System.out.println(system.isHuman());

    }
}

