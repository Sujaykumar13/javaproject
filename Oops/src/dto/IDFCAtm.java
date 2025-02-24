package dto;

public class IDFCAtm implements Atm{
    Atmdto[] accountDtos=new Atmdto[10];
    @Override
    public String details(Atmdto atmdto) {
        boolean flag=false;
        for(int i=0;i<accountDtos.length;i++)
        {
            if(accountDtos[i]==null)
            {
                accountDtos[i]=atmdto;
                flag=true;
                break;
            }
        }
        if(flag=true)
        {
            return "account details";
        }
        return "we not have any details";
    }

    @Override
    public int createPin(int accNo, int pin) {
        for(int i=0;i<accountDtos.length;i++)
        {
            if(accountDtos[i]!=null&&accountDtos[i].getAccNo()==accNo)
            {
                accountDtos[i].setPin(pin);
            }
        }
        return pin;
    }

    @Override
    public int changePin(int accNo, int pin) {
        for(int i=0;i<accountDtos.length;i++)
        {
            if(accountDtos[i]!=null&&accountDtos[i].getAccNo()==accNo)
            {
                accountDtos[i].setPin(pin);
            }
        }
        return pin;
    }

    @Override
    public int withdraw(int pin, int cash) {
        int balance=0;
        for(int i=0;i<accountDtos.length;i++)
        {
            if(accountDtos[i]!=null&&accountDtos[i].getPin()==pin)
            {
                if(accountDtos[i].getBalance()>=cash);
                {
                    accountDtos[i].setBalance(accountDtos[i].getBalance()-cash);
                    balance=accountDtos[i].getBalance();
                }
            }
        }
        return balance;
    }

    @Override
    public int deposit(int accNo, int pin, int cash) {
        int balance=0;
        for(int i=0;i<accountDtos.length;i++)
        {
            if(accountDtos[i]!=null&&accountDtos[i].getPin()==pin && accountDtos[i].getAccNo()==accNo)
            {
                accountDtos[i].setBalance(accountDtos[i].getBalance()+cash);
                balance=accountDtos[i].getBalance();
            }
        }
        return balance;
    }
}
