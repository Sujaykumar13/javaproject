package array;

public class Multiple {
    public static void main(String[] args)
    {
        int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,25,30,45};
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%3==0 && a[i]%5==0)
            {
                System.out.println(a[i] + " is divisble by both 3 and 5");
            }
            else if(a[i]%3==0)
            {
                System.out.println(a[i]+ " is divisble only by 3");
            }
            else if(a[i]%5==0)
            {
                System.out.println(a[i] +" is divisble only by 5");
            }
            else
            {
                System.out.println(a[i] + " is not divisible by both 3 and 5");
            }
        }
    }
}
