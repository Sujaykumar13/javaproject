package org.Array;

public class Array1 {
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%3==0)
            {
                System.out.println("array index is " + i + " and divisible by 3 and it's value is " +a[i]);
            }
            else if(a[i]%5==0)
            {
                System.out.println("array index is " + i + " and divisible by 5 and it's value is " +a[i]);
            }
            else
            {
                System.out.println("array index is " + i + " and not divisible by 5 and 3 it's value is " +a[i]);
            }
        }

    }
}
