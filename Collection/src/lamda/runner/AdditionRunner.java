package lamda.runner;

import lamda.inter.Addition;

public class AdditionRunner {

    public static void main(String[] args)
    {
         Addition add = (int a,int b)-> {
             int c=a + b;
             return c;
         };

        int result = add.sum(10,20);
        System.out.println(result);
    }
}
