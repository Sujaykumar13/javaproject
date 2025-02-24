package objectClass;

public class Car {
    private String carName;
    private String carType;
    private int price;

    public Car(String carName,String carType,int price)
    {
        this.carName=carName;
        this.carType=carName;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Car name is "+carName+" with the type of"+carType+"and price is"+price;
    }

    @Override
    public int hashCode() {
        int hash=20;
        hash=15*hash+this.carName.hashCode();
        hash=15*hash+this.carType.hashCode();
        hash=15*hash+this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null)
        {
            return false;
        }
        if(obj instanceof Car)
        {
            Car car= (Car) obj;
            if(this.carName.equals(car.carName)&&this.carType.equals(car.carType)&&this.price==car.price)
            {
                return true;
            }
        }
        return false;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize method");
        super.finalize();
    }
}
