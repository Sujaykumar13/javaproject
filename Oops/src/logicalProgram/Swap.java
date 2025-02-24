package logicalProgram;

public class Swap {
    public static void main(String[] args)
    {
        int a=10;
        int b=15;
        a=a+b;//a=10+15=25
        b=a-b;//b=25-15=10
        a=a-b;//a=25-10=15
        System.out.println(a);
        System.out.println(b);
    }
}
