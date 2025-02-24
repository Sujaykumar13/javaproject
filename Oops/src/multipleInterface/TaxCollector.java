package multipleInterface;

public class TaxCollector implements Cgst,Sgst {

    String taxCollectionGovernment;

    public TaxCollector(String taxCollectionGovernment)
    {
        this.taxCollectionGovernment=taxCollectionGovernment;
    }

    @Override
    public void authority() {
        System.out.println("higher authority is " +taxCollectionGovernment);
    }

    @Override
    public void exciseTax() {

        System.out.println("excise tax is collected from " +taxCollectionGovernment);
    }

    @Override
    public void goodsTax() {
        System.out.println("Goods tax is collected from " +taxCollectionGovernment);
    }

    @Override
    public void proffesionTax() {
        System.out.println("Proffesional tax is collected from " +taxCollectionGovernment);

    }

    @Override
    public void foriegnExchangeTax() {

        System.out.println("Foreign exchange tax is collected from " +taxCollectionGovernment);

    }
}
