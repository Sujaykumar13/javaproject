package lamda.runner;

import lamda.inter.Division;

public class DivisonRunner {


        public static void main(String[] args)
        {
            Division div = (int a, int b)-> a/b;
            float result = div.divison(30,4);
            System.out.println(result);
        }
    }

