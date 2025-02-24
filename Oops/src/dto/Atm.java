package dto;

public interface Atm {
    public abstract String details(Atmdto atmdto);
    public abstract int createPin(int accNo,int pin);
    public abstract int changePin(int accNo,int pin);
    public abstract int withdraw(int pin,int cash);
    public abstract int deposit(int accNo,int pin,int cash);

    default int cardlessTransaction(int pin,int amount)
    {
        System.out.println("cardless payment");
        return 0;
    }
}
