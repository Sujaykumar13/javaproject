package oops.abs;

public class Laptop1 extends Laptop{
    @Override
    public void ram() {
        System.out.println("laptop as ram of 32gb");
    }

    @Override
    public void hardDisk() {
        System.out.println("Laptop as harddsik of 1 tb");

    }

    @Override
    void display() {
        System.out.println("laptop as display of 40cms");
    }

    public static void main(String[] args)
    {
        //Laptop latop= new Laptop();not able create object for abstract method
        Laptop1 lap= new Laptop1();
        lap.ram();
        lap.hardDisk();
        lap.display();
        lap.graphic();

    }

}
