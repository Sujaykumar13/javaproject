package objectClass;

public class Space {
    private String galaxyName;
    private int galaxyNo;
    private int noOfPlanets;

    public Space(String galaxyName,int galaxyNo,int noOfPlanets)
    {
        this.galaxyName=galaxyName;
        this.galaxyNo=galaxyNo;
        this.noOfPlanets=noOfPlanets;
    }

    @Override
    public String toString() {
        return "name of galaxy is "+galaxyName +"with number"+galaxyNo+" and as "+noOfPlanets+ "of planets";
    }

    @Override
    public int hashCode() {
        return galaxyNo;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null)
        {
            return false;
        }
        if(obj instanceof Space)
        {
            Space space= (Space) obj;
            if(this.galaxyName.equals(space.galaxyName) && this.galaxyNo==space.galaxyNo&&
                    this.noOfPlanets==space.noOfPlanets)
            {
                return true;
            }
        }
        return false;
    }
}
