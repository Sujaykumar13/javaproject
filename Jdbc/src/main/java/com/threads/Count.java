package com.threads;

public class Count implements Runnable{//creating thread by implimenting runnable
    //thread is asynchronous ( but when we not use start() than iti is synchrnous because main method is synchronous)
    @Override
    public void run() {
        for(int i=0;i<1000;i++)
        {
            System.out.println("count is "+i+ " and thread is "+Thread.currentThread().getName());
        }

    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Count count = new Count();
        count.run();

        Thread thread= new Thread(count);
        thread.start();
    }
}
