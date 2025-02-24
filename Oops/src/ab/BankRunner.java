package ab;

public class BankRunner {
    public static void main(String[] args)
    {
        Bank bank=new SbiBank();
        System.out.println(bank.createAccount("sujay",256486));
        System.out.println(bank.deposit(256486,500));
        System.out.println(bank.balance(256486));
        System.out.println(bank.withdraw(256486,300));
        System.out.println(bank.closeAccount(256486));
        Bank bank1=new CanaraBank();
        System.out.println(bank1.createAccount("sneha",256476));
        System.out.println(bank1.deposit(256476,500));
        System.out.println(bank1.balance(256476));
        System.out.println(bank1.withdraw(256476,300));
        System.out.println(bank1.closeAccount(256476));
        Bank bank2=new HdfcBank();
        System.out.println(bank2.createAccount("rahul",256487));
        System.out.println(bank2.deposit(256487,500));
        System.out.println(bank2.balance(256487));
        System.out.println(bank2.withdraw(256487,300));
        System.out.println(bank2.closeAccount(256487));
        Bank bank3=new IdfcBank();
        System.out.println(bank3.createAccount("tom",356486));
        System.out.println(bank3.deposit(356486,500));
        System.out.println(bank3.balance(356486));
        System.out.println(bank3.withdraw(356486,300));
        System.out.println(bank3.closeAccount(356486));

    }
}
