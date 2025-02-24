package array;

public class Bike {
    private String brand;
    private int gears;
    private String type;
    private int speed;
    public Bike(String brand,int gears,String type,int speed)
    {
        this.brand=brand;
        this.gears=gears;
        this.type=type;
        this.speed=speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }
    public String getType(){
        return type;
    }

    public int getGears() {
        return gears;
    }

    public int getSpeed() {
        return speed;
    }

    public String toString()
    {
        return "brand of bike-"+brand +" type-"+type+" gears"+gears+"speed"+speed;
    }
}
