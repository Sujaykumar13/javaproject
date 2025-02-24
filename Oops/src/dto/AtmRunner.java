package dto;

public class  AtmRunner {
    public static void main(String[] args) {
        System.out.println("SBI bank");
        Atmdto atm = new Atmdto();
        atm.setName("sujay");
        atm.setBalance(10000);
        atm.setAtmNo(54565431);
        atm.setAccNo(1546532032);
        atm.setPin(1302);
        atm.setDateOfBirth("13/02/1997");
        Atm runner=new SbiAtm();
        System.out.println(runner.details(atm));
        System.out.println(runner.createPin(1546532032,1302));
        System.out.println(runner.changePin(1546532032,1322) );
        System.out.println(runner.withdraw(1322,1000));
        System.out.println(runner.deposit(1546532032,1322,1000));
        System.out.println(runner.cardlessTransaction(1322,1000));

        System.out.println("canara bank");
        Atmdto atm1 = new Atmdto();
        atm1.setName("sneha");
        atm1.setBalance(10000);
        atm1.setAtmNo(64565431);
        atm1.setAccNo(254653203);
        atm1.setPin(2503);
        atm1.setDateOfBirth("25/03/2002");
        Atm runner1=new CanaraAtm();
        System.out.println(runner1.details(atm1));
        System.out.println(runner1.createPin(254653203,2503));
        System.out.println(runner1.changePin(254653203,2513) );
        System.out.println(runner1.withdraw(2513,1000));
        System.out.println(runner1.deposit(254653203,2513,1000));
        System.out.println(runner1.cardlessTransaction(2513,1000));

        System.out.println("HDFC bank");
        Atmdto atm2 = new Atmdto();
        atm2.setName("rahul");
        atm2.setBalance(10000);
        atm2.setAtmNo(54565431);
        atm2.setAccNo(1546532032);
        atm2.setPin(1302);
        atm2.setDateOfBirth("16/04/2002");
        Atm runner2=new HDFCAtm();
        System.out.println(runner2.details(atm2));
        System.out.println(runner2.createPin(1546532032,1302));
        System.out.println(runner2.changePin(1546532032,1322) );
        System.out.println(runner2.withdraw(1322,1000));
        System.out.println(runner2.deposit(1546532032,1322,1000));

        System.out.println("idfc bank");
        Atmdto atm3 = new Atmdto();
        atm3.setName("tom");
        atm3.setBalance(10000);
        atm3.setAtmNo(54565431);
        atm3.setAccNo(1546532032);
        atm3.setPin(1302);
        atm3.setDateOfBirth("25/03/1997");
        Atm runner3=new IDFCAtm();
        System.out.println(runner3.details(atm3));
        System.out.println(runner3.createPin(1546532032,1302));
        System.out.println(runner3.changePin(1546532032,1322) );
        System.out.println(runner3.withdraw(1322,1000));
        System.out.println(runner3.deposit(1546532032,1322,1000));


    }
}
