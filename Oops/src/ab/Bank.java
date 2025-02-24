package ab;

public interface Bank {

    public abstract String createAccount(String name,int accNo);
    public abstract int deposit(int accNo,int amount);
    public abstract int balance(int accNo);
    public abstract int withdraw(int accNo,int cash);
    public abstract String closeAccount(int accNo);

}
