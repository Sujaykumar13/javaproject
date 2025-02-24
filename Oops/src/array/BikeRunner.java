package array;

public class BikeRunner {
    Bike[] bikes=new Bike[10];
    public static void main(String[] args)
    {
        BikeRunner runner = new BikeRunner();
        System.out.println("bike 1");
        Bike bike1=new Bike("suzuki",6,"sports",300);
        System.out.println(runner.saveDetails(bike1));
        Bike b1=runner.fetchDetailsByBrand("suzuki");
        System.out.println(b1.getBrand());
        System.out.println(b1.getSpeed());
        System.out.println(b1.getGears());
        System.out.println(b1.getType());
        System.out.println(runner.updateSpeedByBrand("suzuki",350));
        System.out.println(b1.toString());
        System.out.println(runner.deleteDetails("suzuki"));
        Bike d=runner.fetchDetailsByBrand("suzuki");
        //System.out.println(d.toString());

        System.out.println("bike 2");
        Bike bike2=new Bike("honda",6,"sports",200);
        System.out.println(runner.saveDetails(bike2));
        Bike b2=runner.fetchDetailsByBrand("honda");
        System.out.println(b2.toString());

        System.out.println("bike 3");
        Bike bike3=new Bike("kawasaki",6,"sports",350);
        System.out.println(runner.saveDetails(bike3));
        Bike b3=runner.fetchDetailsByBrand("kawasaki");
        System.out.println(b3.toString());

        System.out.println("bike 4");
        Bike bike4=new Bike("hero",4,"sports",150);
        System.out.println(runner.saveDetails(bike4));
        Bike b4=runner.fetchDetailsByBrand("hero");
        System.out.println(b4.toString());

        System.out.println("bike 5");
        Bike bike5=new Bike("bmw",6,"sports",350);
        System.out.println(runner.saveDetails(bike5));
        Bike b5=runner.fetchDetailsByBrand("bmw");
        System.out.println(b5.toString());

        System.out.println("bike 6");
        Bike bike6=new Bike("enfield",5,"crusier",200);
        System.out.println(runner.saveDetails(bike6));
        Bike b6=runner.fetchDetailsByBrand("enfield");
        System.out.println(b6.toString());

        System.out.println("bike 7");
        Bike bike7=new Bike("java",5,"crusier",200);
        System.out.println(runner.saveDetails(bike7));
        Bike b7=runner.fetchDetailsByBrand("java");
        System.out.println(b7.toString());

        System.out.println("bike 8");
        Bike bike8=new Bike("ducati",6,"sports",300);
        System.out.println(runner.saveDetails(bike8));
        Bike b8=runner.fetchDetailsByBrand("ducati");
        System.out.println(b8.toString());

        System.out.println("bike 9");
        Bike bike9=new Bike("yamaha",6,"sports",300);
        System.out.println(runner.saveDetails(bike9));
        Bike b9=runner.fetchDetailsByBrand("yamaha");
        System.out.println(b9.toString());

        System.out.println("bike 10");
        Bike bike10=new Bike("cbr",6,"sports",250);
        System.out.println(runner.saveDetails(bike10));
        Bike b10=runner.fetchDetailsByBrand("cbr");
        System.out.println(b10.toString());

    }

    public boolean saveDetails(Bike bike)
    {
        boolean flag=false;
        for(int i=0;i< bikes.length;i++)
        {
            if(bikes[i]==null)
            {
                bikes[i]=bike;

                flag=true;
                break;
            }
        }
        return flag;
    }
    public Bike fetchDetailsByBrand(String brand)
    {
        for(int i=0;i<bikes.length;i++)
        {
            if(bikes[i] !=null && bikes[i].getBrand()==brand)
            {
                return bikes[i];
            }
        }
        return null;
    }
    public boolean updateSpeedByBrand(String brand,int speed)
    {
        for(int i=0;i< bikes.length;i++)
        {
            if(bikes[i]!=null && bikes[i].getBrand()==brand)
            {
                bikes[i].setSpeed(speed);
                return true;
            }
        }
        return false;
    }
    public boolean deleteDetails(String brand)
    {
        for(int i=0;i< bikes.length;i++)
        {
            if(bikes[i]!=null && bikes[i].getBrand()==brand)
            {
                bikes[i] = null;
                return true;
            }
        }
        return false;
    }

}
