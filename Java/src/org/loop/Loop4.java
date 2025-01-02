package org.loop;

public class Loop4 {
    public static void main(String[] args)
    {
        for(int i=1;i<10;i++)
        {
            System.out.println(i*4+1);
        }
        int i=1;
        while(i<11)
        {
            System.out.println(i*3);
            i++;
        }
        boolean busavailable= true;
        do{
            System.out.println("we go by auto");
        }while(busavailable== false);

    }
}
