package lamda.runner;

import lamda.inter.Laptop;

public class LaptopRunner {

    public static void main(String[] args)
    {
        Laptop lap = (int a)-> a;
        int result = lap.ram(8);
        System.out.println(result);
    }
}
