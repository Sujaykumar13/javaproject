package exception;

public class Laptop {
    boolean windowspresent;
    public Laptop(boolean windowspresent)
    {
        this.windowspresent=windowspresent;
    }

    public boolean isWindowspresent() {
        return windowspresent;
    }
    public static void main(String[] args)
    {
        Laptop lap=new Laptop(false);
        if(lap.isWindowspresent()==true)
        {
            System.out.println("Laptop will work");
        }
        else {
            throw new WindowsnotfoundException("Laptop will not work");
        }

    }
}
