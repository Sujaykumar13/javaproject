package ab;

public interface Atm {
    public abstract int createPin(int accNo,int pin);
    public abstract int changePin(int accNo,int pin);
    public abstract int withdraw(int pin,int cash);
    public abstract int deposit(int accNo,int pin,int cash);
    public abstract String statement(int pin);
// we can inherit interface to interface using extends
}
 //we can create object us ing class.forname(classname)