package methodOverriding;

public class Mobile1 extends Mobile {
    String mobileColor;
    public Mobile1(String brand,int price,String mobileColor)
    {
        super(brand, price);
        this.mobileColor=mobileColor;
        System.out.println("child class");
    }
    public String getMobileColor()
    {
        return mobileColor;
    }
    public void camera()
    {
        System.out.println("camera as updated to 96MP");
    }
    public static void main(String[] args)
    {
        Mobile1 mobile = new Mobile1("samsung",20000,"black");
        System.out.println(mobile.getMobileColor());
        System.out.println(mobile.getBrand());
        System.out.println(mobile.getPrice());
        mobile.camera();
    }
}
