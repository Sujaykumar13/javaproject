package array;

public class Car {
    private int number;
    private String brand;
    private String type;
    private int seats;
    public Car(int number,String brand,String type,int seats)
    {
        this.number=number;
        this.brand=brand;
        this.type=type;
        this.seats=seats;
    }
    public void setSeats(int seats)
    {
        this.seats=seats;
    }

    public int getNumber() {
        return number;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }
    public String toString()
    {
        return "car number-"+number+" brand-"+brand+"type-"+type+"seats-"+seats;
    }
}
