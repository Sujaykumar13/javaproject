package dto;

public class HDFCBank implements Bank {
    Bankdto[] accountDtos=new Bankdto[10];


    @Override
    public String createAccount(Bankdto bankdto) {
        boolean flag=false;
        for(int i=0;i<accountDtos.length;i++)
        {
            if(accountDtos[i]==null)
            {
                accountDtos[i]=bankdto;
                flag=true;
                break;
            }
        }
        if(flag=true)
        {
            return "account details added";
        }
        return " account details not added";
    }

    @Override
    public int deposit(int accNo, int amount) {
        int balance=0;
        for(int i=0;i<accountDtos.length;i++)
        {
            if(accountDtos[i]!=null && accountDtos[i].getAccNo()==accNo)
            {
                accountDtos[i].setBalance(accountDtos[i].getBalance()+amount);
                balance=accountDtos[i].getBalance();
            }
        }
        return balance;
    }

    @Override
    public int balance(int accNo) {
        int balance=0;
        for(int i=0;i<accountDtos.length;i++)
        {
            if(accountDtos[i]!=null && accountDtos[i].getAccNo()==accNo)
            {
                balance=accountDtos[i].getBalance();
            }
        }

        return balance;
    }

    @Override
    public int withdraw(int accNo, int cash) {
        for(int i=0;i<accountDtos.length;i++)
        {
            if(accountDtos[i]!=null && accountDtos[i].getAccNo()==accNo)
            {
                if(accountDtos[i].getBalance()>=cash) {
                    accountDtos[i].setBalance(accountDtos[i].getBalance() - cash);
                }
            }
        }
        return cash;
    }

    @Override
    public String closeAccount(int accNo) {
        int balance=0;
        for(int i=0;i<accountDtos.length;i++)
        {
            if(accountDtos[i]!=null && accountDtos[i].getAccNo()==accNo)
            {
                accountDtos[i]=null;
            }
        }
        return "account deleted";
    }
}
