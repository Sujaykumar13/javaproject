package exception;

public class Bottle {
    int bottleCapcity;
    public Bottle(int bottleCapcity)
    {
        this.bottleCapcity=bottleCapcity;
    }

    public int getBottleCapcity() {
        return bottleCapcity;
    }
    public static void main(String[] args)
    {
        int waterQuantity=3;
        Bottle bottle=new Bottle(2);
        if(bottle.bottleCapcity==waterQuantity)
        {
            System.out.println("water can be fill into bottle");
        }
        else {
            throw new OverflowException("Quantity of water is more than bottle capacity");
        }
    }
}
