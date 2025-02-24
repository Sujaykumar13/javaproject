package dto;

public interface Bank {
    public abstract String createAccount(Bankdto bankdto);
    public abstract int deposit(int accNo,int amount);
    public abstract int balance(int accNo);
    public abstract int withdraw(int accNo,int cash);
    public abstract String closeAccount(int accNo);

    default int withdrawUsingUpi(int accNo,int amount)
    {
        System.out.println("upi transcation");
        return 0;
    }

}
