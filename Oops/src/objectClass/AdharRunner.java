package objectClass;

public class AdharRunner {
    public static void main(String[] args)
    {
        Adhar adhar=new Adhar(132526543,"sujay");
        System.out.println(adhar.toString());
        System.out.println(adhar.hashCode());

        Adhar adhar1=new Adhar(132527853,"sneha");
        System.out.println(adhar1.toString());
        System.out.println(adhar1.hashCode());

        Adhar adhar2=new Adhar(132526543,"sujay");
        System.out.println(adhar2.toString());
        System.out.println(adhar2.hashCode());
        System.out.println(adhar==adhar2);
        System.out.println(adhar.equals(adhar2));
        System.out.println(adhar.equals(adhar1));
    }
}
