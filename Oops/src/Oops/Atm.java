package Oops;

public class Atm {
    private int accno;
    private int pin;

    public Atm(int accno,int pin)
    {
        this.accno=accno;
        this.pin=pin;
    }

    public int getAccno() {
        return accno;
    }

    public int getPin() {
        return pin;
    }
}
