package logicalProgram;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int num=153;
        int sum=0;
        int n=num;
        while(n!=0)
        {
            int rem=n%10;
            sum= sum+(rem*rem*rem);
            n=n/10;
        }
        if(num==sum)
        {
            System.out.println("number is armstrong");
        }

        else {
            System.out.println("number is not armstrong");
        }
    }
}
