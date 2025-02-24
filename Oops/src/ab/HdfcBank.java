package ab;

public class HdfcBank implements Bank{
    int accNo;
    String name;
    int balance;
    @Override
    public String createAccount(String name,int accNo) {
        System.out.println("Hdfc bank account is created");
        this.accNo=accNo;
        this.name=name;
        return "Account created successfully in Hdfc bank with name"+name+" and account number"+accNo;
    }

    @Override
    public int deposit(int accNo,int amount) {
        if(this.accNo==accNo)
        {
            balance=balance+amount;
            System.out.println("ammount deposited successfully");
        }
        else{
            System.out.println("wrong account");
        }
        return balance;
    }

    @Override
    public int balance(int accNo) {
        if(this.accNo==accNo) {
            System.out.println("balance is"+balance);
        }
        else{
            System.out.println("wrong account");
        }

        return balance;
    }

    @Override
    public int withdraw(int accNo,int cash) {
        if(this.accNo==accNo)
        {
            if(balance>=cash) {
                balance = balance- cash;
                System.out.println("ammount withdraw successfully");
            }
            else{
                System.out.println("balance is less than cash entered");
            }
        }
        else{
            System.out.println("wrong account");
        }
        return cash;

    }

    @Override
    public String closeAccount(int accNo) {
        if(this.accNo==accNo)
        {
            System.out.println("account close successfully in Hdfc bank");
        }
        else{
            System.out.println("wrong account");
        }
        return "account close successfully in Hdfc bank";
    }
}
