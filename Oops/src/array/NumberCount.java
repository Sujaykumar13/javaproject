package array;

public class NumberCount {
    public static void main(String[] args)
    {
        int a=001 ;
        int b=0;
        while(a>0)
        {
           int q=a/10;
           int r=a%10;
           if(r
                   >0)
           {
               b++;
           }
           a=q;
        }
        System.out.println(b);
    }

}
