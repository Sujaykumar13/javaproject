package polymorphism;

public class CalcuklatorRunner {
    public static void main(String[] args)
    {
        Calculator calculator=new Calculator();
        int result = calculator.add(10,20);
        System.out.println(result);
        double result1=calculator.add(10.26,265.35);
        System.out.println(result1);
        result=calculator.add(10,50,67);
        System.out.println(result);


    }
}
