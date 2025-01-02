package org.loop;

public class Metro {
    public static void main(String[] args)
    {
        boolean dooropen = true;

        boolean majestic = true;
        boolean mantrisquare = true;
        boolean rajajinagar = true;
        boolean mahalakshmi = true;

        if (majestic == true && dooropen == true)
        {
            System.out.print("stop is majestic");
        }
        else if (mantrisquare == false && dooropen == true)
        {
            System.out.print("stop is mantrisquare");
        }
        else if (rajajinagar == false && dooropen == true)
        {
            System.out.print("stop is rajajinagar");
        }
        else if (mahalakshmi== false && dooropen == true)
        {
            System.out.print("stop is mahalakshmi");
        }
        else
        {
            System.out.print("stop is yeshwantpur");
        }
    }
}
