package lamda.runner;

import lamda.inter.Sumation;

public class SumationRunner {

    public static void main(String[] args)
    {
        Sumation sum = (int a, int b, int c)-> a+b+c;
        int result = sum.sum(30,40,10);
        System.out.println(result);
    }
}
