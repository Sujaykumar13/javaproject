package objectClass;

public class Bike {
    private int bikeNo;
    private String bikeType;

    public Bike(int bikeNo,String bikeType)
    {
        this.bikeNo=bikeNo;
        this.bikeType=bikeType;
    }

    public String toString()
    {
        return "bike no is "+bikeNo+ "and bike type is"+bikeType;
    }

    @Override
    public int hashCode() {
        return bikeNo;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null)
        {
            return false;
        }

        if(obj instanceof Bike)
        {
            Bike bike= (Bike) obj;
            if(this.bikeNo == bike.bikeNo &&  this.bikeType.equals(bike.bikeType))
            {
                return true;
            }
        }
        return false;
    }
}
