package ab;

public class IdfcAtm implements Atm{
    int pin;
    int accNo=335648;
    int ammount=9000;
    @Override
    public int createPin(int accNo, int pin) {
        if(this.accNo==accNo)
        {
            System.out.println("idfc bank account pin generated");
            this.pin=pin;
        }
        else {
            System.out.println("account number mismatched");
        }
        return pin;
    }

    @Override
    public int changePin(int accNo, int changePin) {
        if(this.accNo==accNo)
        {
            System.out.println("idfc bank account pin changed");
            pin=changePin;
        }
        else {
            System.out.println("account number mismatched");
        }
        return pin;
    }

    @Override
    public int withdraw(int pin, int cash) {
        if(ammount>=cash)
        {
            System.out.println("cash withdraw from idfc atm");
            ammount=ammount-cash;
        }
        else {
            System.out.println("low balance");
        }

        return cash;
    }

    @Override
    public int deposit(int accNo, int pin, int cash) {
        if(this.accNo==accNo)
        {
            System.out.println("cash deposit from idfc atm");
            ammount=ammount+cash;
        }
        else {
            System.out.println("account number mismatched");
        }
        return ammount;
    }

    @Override
    public String statement(int pin) {
        if(this.pin==pin)
        {
            System.out.println("statement generated");
        }
        else {
            System.out.println("account number mismatched");
        }
        return "statement generated for "+accNo+"in Idfc atm";
    }
}
