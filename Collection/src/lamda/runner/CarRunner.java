package lamda.runner;

import lamda.inter.Car;

public class CarRunner {
        public static void main(String[] args)
        {
            Car car = (int a)-> a*20;
            float tax=0.2f;
            float result = car.carPrice(1000000000)*tax;
            System.out.println(result);
        }
    }

