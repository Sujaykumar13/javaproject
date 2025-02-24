package ab;

public class AtmRunner {
    public static void main(String[] args)
    {
        Atm atm=new SbiAtm();
        System.out.println(atm.createPin(256489,1302));
        System.out.println(atm.changePin(256489,1313));
        System.out.println(atm.withdraw(1313,2000));
        System.out.println(atm.deposit(256489,1313,3000));
        System.out.println(atm.statement(1313));
        Atm atm1=new CanaraAtm();
        System.out.println(atm1.createPin(256488,1312));
        System.out.println(atm1.changePin(256488,1303));
        System.out.println(atm1.withdraw(1303,2000));
        System.out.println(atm1.deposit(256488,1303,3000));
        System.out.println(atm1.statement(1303));
        Atm atm2=new HdfcAtm();
        System.out.println(atm2.createPin(466488,2312));
        System.out.println(atm2.changePin(466488,2304));
        System.out.println(atm2.withdraw(2304,2000));
        System.out.println(atm2.deposit(466488,2304,3000));
        System.out.println(atm2.statement(2304));
        Atm atm3=new IdfcAtm();
        System.out.println(atm3.createPin(335648,4312));
        System.out.println(atm3.changePin(335648,4305));
        System.out.println(atm3.withdraw(4305,2000));
        System.out.println(atm3.deposit(335648,4305,3000));
        System.out.println(atm3.statement(4305));

    }
}
