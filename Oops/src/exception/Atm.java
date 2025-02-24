package exception;

public class Atm {
    int pin;
    public Atm(int pin)
    {
        this.pin=pin;
    }

    public int getPin() {
        return pin;
    }
    public static void main(String[] args)
    {
        int actualPin=1564;
        Atm atm= new Atm(1234);
        if(atm.getPin()==actualPin)
        {
            System.out.println("pin is correct");
        }
        else
        {
            throw new PinnotcorrectException();
        }
    }
}
