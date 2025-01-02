package Stringclass;

public class Palindrome   {
    public static void main(String[] args)
    {
        String str1="madam";
        System.out.println(str1);
        char[] a=str1.toCharArray();
        String str2="";

        for(int i=a.length-1;i>=0;i--)
        {
            str2= a[i] + str2;
        }
        System.out.println(str2);
        if(str1.equals(str2))
        {
            System.out.println("given string is palindrome");
        }
        else
        {
            System.out.println("given string is not palindrome");
        }
    }
}
