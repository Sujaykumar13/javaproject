package logicalProgram;

public class PrimeNumber {
    public static void main(String[] args)
    {
        //int n=9;
        for(int n=2;n<=20;n++) {
            boolean flag=false;
           for (int i = 2; i < n ;i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag=true;
                    break;
                }
            }
           if(flag==false){
               System.out.println(n+" is a prime number");
           }
        }
    }
}
