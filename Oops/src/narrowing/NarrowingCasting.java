package narrowing;

public class NarrowingCasting {
    public static void main(String[] args)
    {
        System.out.println("narrowing typecasting from short to byte");
        short a=129;
        byte b= (byte) a;//explicit typecasting
        System.out.println(a);
        System.out.println(b);

        System.out.println("narrowing typecasting from int to byte");
        int c=1292132;
        byte d= (byte) c;//explicit typecasting
        System.out.println(c);
        System.out.println(d);

        System.out.println("narrowing typecasting from long to int");
        long e=1296512121;
        int f= (int) e;//explicit typecasting
        System.out.println(e);
        System.out.println(f);

        System.out.println("narrowing typecasting from float to short");
        float g=129.2f;
        short h= (short) g;//explicit typecasting
        System.out.println(g);
        System.out.println(h);

        System.out.println("narrowing typecasting from double to float");
        double i=12.3265468465;
        float j= (float) i;//explicit typecasting
        System.out.println(i);
        System.out.println(j);
    }
}
