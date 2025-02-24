package multipleInterface;

public class TaxCollectorRunner {
    public static void main(String[] args)
    {
        Cgst tax1=new TaxCollector("India government");
        tax1.authority();
        tax1.proffesionTax();
        tax1.foriegnExchangeTax();
        TaxCollector t1= (TaxCollector) tax1;
        t1.exciseTax();
        t1.goodsTax();

        Sgst tax2 = new TaxCollector("state government");
        tax2.authority();
        tax2.exciseTax();
        tax2.goodsTax();
        TaxCollector t2= (TaxCollector) tax2;
        t2.proffesionTax();t2.foriegnExchangeTax();
    }
}
