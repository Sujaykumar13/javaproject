package widening;

public class WideningCasting {
    public static void main(String[] args)
    {
        System.out.println("widening typecasting from int to long");
        int a=15;
        long b=a;
        System.out.println(a);
        System.out.println(b);

        System.out.println("widening typecasting from byte to short");
        byte c=127;
        short d=c;
        System.out.println(c);

        System.out.println("widening typecasting from short to int");
        short e=1500;
        int f=e;
        System.out.println(e);
        System.out.println(f);

        System.out.println("widening typecasting from int to float");
        int g=15;
        float h=g;
        System.out.println(g);
        System.out.println(h);

        System.out.println("widening typecasting from float to double");
        float i=15.2f;
        double j=i;
        System.out.println(i);
        System.out.println(j);
    }
}
