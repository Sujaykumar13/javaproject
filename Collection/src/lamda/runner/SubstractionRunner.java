package lamda.runner;
import lamda.inter.Substraction;

public class SubstractionRunner {

        public static void main(String[] args)
        {
            Substraction sub = (int a, int b)-> a-b;
            int result = sub.sub(30,40);
            System.out.println(result);
        }
    }


