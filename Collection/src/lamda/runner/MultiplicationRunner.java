package lamda.runner;

import lamda.inter.Multiplication;

public class MultiplicationRunner {

        public static void main(String[] args)
        {
            Multiplication mul = (int a, int b,int c)-> a*b;
            int result = mul.mul(30,40,10);
            System.out.println(result);
        }
    }




