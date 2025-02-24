package clone;
//Shallow cloning
public class Soap implements Cloneable {
    String brand;
    String name;
    int price;

    public Soap(String brand, String name, int price) {
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Soap soap=new Soap("Cholayil","medimix",75);
        //before cloning
        System.out.println(soap.brand);
        System.out.println(soap.name);
        System.out.println(soap.price);

        Soap soap1= (Soap) soap.clone();
        soap1.price=80;
        System.out.println(soap1.price);
        System.out.println(soap.price);

}

}
