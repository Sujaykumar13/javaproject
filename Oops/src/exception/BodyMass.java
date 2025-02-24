package exception;

public class BodyMass {
    int bmi;
    public BodyMass(int bmi)
    {
        this.bmi=bmi;
    }

    public int getBmi() {
        return bmi;
    }
    public static void main(String[] args)
    {
        BodyMass mass=new BodyMass(8);
        if(mass.getBmi()>12)
        {
            System.out.println("weight is normal");
        }
        else
        {
            throw new OverweightException("bodymass is not normal");
        }
    }
}
