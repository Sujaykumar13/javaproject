package lamda.runner;

import lamda.inter.Addition;

public class AdditionRunner {

    public static void main(String[] args)
    {
         Addition add = (int a,int b)-> a+b;
        int result = add.sum(10,20);
        System.out.println(result);
    }
}
