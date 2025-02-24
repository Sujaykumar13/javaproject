package oops.abs;

public abstract class Laptop {
    //public abstract int price;not able to declare variable as abstract


    public abstract void ram();
    protected abstract void hardDisk();
    abstract void display();
    //private abstract void keyboard();//not able declare abstract as private
    //public final abstract void working();//not able to declare abstract as final
    //public static abstract void battery();//not able to declare abstract as static
    public void graphic()
    {
        System.out.println("laptop as graphic gard");
    }
}
