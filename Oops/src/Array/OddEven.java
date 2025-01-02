package Array;

public class OddEven {
    public static void main(String[] args)
    {
        int[] a={1,2,3,4,5,6,7,8,9,10,11,12};
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                System.out.println(a[i]+" is a even number");
            }
            else
            {
                System.out.println(a[i]+" is a odd number");
            }
        }
    }

}
