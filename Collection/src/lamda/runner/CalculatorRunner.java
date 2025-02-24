package lamda.runner;

import lamda.inter.Calculator;

public class CalculatorRunner {

    public static void main(String[] args)
    {
        Calculator calu = (int a, int b, int c)-> a*b/c*b;
        float result = calu.cal(30,40,10);
        System.out.println(result);
    }
}
