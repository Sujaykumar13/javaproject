package dto;

public class BankRunner {
    public static void main(String[] args)
    {
        System.out.println("SBI bank");
        Bankdto dto=new Bankdto();
        dto.setName("sujay");
        dto.setAddress("bangalore");
        dto.setBalance(5000);
        dto.setIfsc("SBI21356");
        dto.setAccNo(25698);
        dto.setDateOfBirth("13/02/1997");
        Bank sbi=new SbiBank();
        System.out.println(sbi.createAccount(dto));
        System.out.println(sbi.deposit(25698,500));
        System.out.println(sbi.balance(25698));
        System.out.println(sbi.withdraw(25698,300));
        System.out.println(sbi.closeAccount(25698));
        System.out.println(sbi.withdrawUsingUpi(25698,200));


        System.out.println("canara bank");
        Bankdto dto1=new Bankdto();
        dto1.setName("sneha");
        dto1.setAddress("bangalore");
        dto1.setBalance(5000);
        dto1.setIfsc("SBI21356");
        dto1.setAccNo(35697);
        dto1.setDateOfBirth("25/03/2002");
        Bank canara=new CanaraBank();
        System.out.println(canara.createAccount(dto1));
        System.out.println(canara.deposit(35697,5000));
        System.out.println(canara.balance(35697));
        System.out.println(canara.withdraw(35697,3000));
        System.out.println(canara.closeAccount(35697));
        System.out.println(canara.withdrawUsingUpi(35697,200));

        System.out.println("hdfc bank");
        Bankdto dto2=new Bankdto();
        dto2.setName("rahul");
        dto2.setAddress("bangalore");
        dto2.setBalance(5000);
        dto2.setIfsc("SBI21356");
        dto2.setAccNo(45697);
        dto2.setDateOfBirth("16/04/1992");
        Bank hdfc=new HDFCBank();
        System.out.println(hdfc.createAccount(dto2));
        System.out.println(hdfc.deposit(45697,3000));
        System.out.println(hdfc.balance(45697));
        System.out.println(hdfc.withdraw(45697,2000));
        System.out.println(hdfc.closeAccount(45697));

        System.out.println("idfc bank");
        Bankdto dto3=new Bankdto();
        dto3.setName("tom");
        dto3.setAddress("bangalore");
        dto3.setBalance(5000);
        dto3.setIfsc("SBI21356");
        dto3.setAccNo(55698);
        dto3.setDateOfBirth("18/02/1987");
        Bank idfc=new IDFCBank();
        System.out.println(idfc.createAccount(dto3));
        System.out.println(idfc.deposit(55698,500));
        System.out.println(idfc.balance(55698));
        System.out.println(idfc.withdraw(55698,200));
        System.out.println(idfc.closeAccount(55698));


    }
}
