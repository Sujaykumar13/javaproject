package array;

public class CarRunner {
    Car[] cars = new Car[10];
    public static void main(String[] args)
    {
        CarRunner runner=new CarRunner();
        System.out.println("car object 1");
        Car car1=new Car(4561,"audi","xuv",4);
        System.out.println(runner.saveDetails(car1));
        Car c1=runner.fetchDetailsByNumber(4561);
        System.out.println(c1.toString());
        System.out.println(runner.updateSeatsByNumber(4561,8));
        System.out.println(c1.toString());

        System.out.println("car object 2");
        Car car2=new Car(4572,"benz","xuv",4);
        System.out.println(runner.saveDetails(car2));
        Car c2=runner.fetchDetailsByNumber(4572);
        System.out.println(c2.toString());
        System.out.println(runner.deleteDetails(4572));
        //Car d=runner.fetchDetailsByNumber(4572);
        //System.out.println(d.toString());

        System.out.println("car object 3");
        Car car3=new Car(4562,"audi","xuv",8);
        System.out.println(runner.saveDetails(car3));
        Car c3=runner.fetchDetailsByNumber(4562);
        System.out.println(c3.toString());

        System.out.println("car object 4");
        Car car4=new Car(4581,"bently","suv",4);
        System.out.println(runner.saveDetails(car4));
        Car c4=runner.fetchDetailsByNumber(4581);
        System.out.println(c4.toString());

        System.out.println("car object 5");
        Car car5=new Car(4551,"bently","xuv",8);
        System.out.println(runner.saveDetails(car5));
        Car c5=runner.fetchDetailsByNumber(4551);
        System.out.println(c5.toString());

        System.out.println("car object 6");
        Car car6=new Car(4541,"bmw","suv",4);
        System.out.println(runner.saveDetails(car6));
        Car c6=runner.fetchDetailsByNumber(4541);
        System.out.println(c6.toString());

        System.out.println("car object 7");
        Car car7=new Car(4531,"rolceroyce","xuv",8);
        System.out.println(runner.saveDetails(car7));
        Car c7=runner.fetchDetailsByNumber(4531);
        System.out.println(c1.toString());

        System.out.println("car object 8");
        Car car8=new Car(4521,"honda","suv",4);
        System.out.println(runner.saveDetails(car8));
        Car c8=runner.fetchDetailsByNumber(4521);
        System.out.println(c8.toString());

        System.out.println("car object 9");
        Car car9=new Car(4511,"honda","xuv",8);
        System.out.println(runner.saveDetails(car9));
        Car c9=runner.fetchDetailsByNumber(4511);
        System.out.println(c9.toString());

        System.out.println("car object 10");
        Car car10=new Car(4501,"hyundai","suv",4);
        System.out.println(runner.saveDetails(car10));
        Car c10=runner.fetchDetailsByNumber(4581);
        System.out.println(c10.toString());

    }
    public boolean saveDetails(Car car)
    {
        boolean flag=false;
        for(int i=0;i< cars.length;i++)
        {
            if(cars[i]==null)
            {
                cars[i]=car;

                flag=true;
                break;
            }
        }
        return flag;
    }
    public Car fetchDetailsByNumber(int number)
    {
        for(int i=0;i<cars.length;i++)
        {
            if(cars[i].getNumber()==number)
            {
                return cars[i];
            }
        }
        return null;
    }
    public boolean updateSeatsByNumber(int number,int seats)
    {
        for(int i=0;i< cars.length;i++)
        {
            if(cars[i].getNumber()==number)
            {
                cars[i].setSeats(seats);
                return true;
            }
        }
        return false;
    }
    public boolean deleteDetails(int number)
    {
        for(int i=0;i< cars.length;i++)
        {
            if(cars[i].getNumber()==number)
            {
                cars[i] = null;
                return true;
            }
        }
        return false;
    }
}
