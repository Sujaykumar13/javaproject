package methodOverloading;

public class Bag {
    String type;
    int price;
    int capacity;

    public void bagDetails(String type)
    {
        this.type=type;
    }
    public void bagDetails(String type,int price)
    {
        this.price=price;
        this.type=type;
    }
    public void bagDetails(int price,String type,int capacity) {
        this.price = price;
        this.type = type;
        this.capacity = capacity;
    }
    public String getType()
    {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getCapacity() {
        return capacity;
    }
    public static void main(String[] args)
    {
        Bag bag=new Bag();
        bag.bagDetails("cotton");
        bag.bagDetails("collagebag",2000);
        bag.bagDetails(1500,"carrybag",25);
        System.out.println(bag.getType());
        System.out.println(bag.getPrice());
        System.out.println(bag.getCapacity()
        );
    }
}
