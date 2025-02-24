package array;

public class LaptopRunner {
    Laptop[] laptops=new Laptop[10];
    public static void main(String[] args)
    {
        LaptopRunner runner = new LaptopRunner();
        System.out.println("Laptop 1");
        Laptop lap1=new Laptop("hp",30000,8,20000);
        System.out.println(runner.saveDetails(lap1));
        Laptop l1= runner.fetchDetailsByBrand("hp");
        System.out.println(l1.toString());
        System.out.println(runner.updateRamByBrand("hp",10));
        System.out.println(l1.toString());
        System.out.println(runner.deleteDetails("hp"));

        System.out.println("Laptop 2");
        Laptop lap2=new Laptop("dell",40000,8,20000);
        System.out.println(runner.saveDetails(lap2));
        Laptop l2= runner.fetchDetailsByBrand("dell");
        System.out.println(l2.toString());

        System.out.println("Laptop 3");
        Laptop lap3=new Laptop("lenovo",35000,10,30000);
        System.out.println(runner.saveDetails(lap3));
        Laptop l3= runner.fetchDetailsByBrand("lenovo");
        System.out.println(l3.toString());

        System.out.println("Laptop 4");
        Laptop lap4=new Laptop("acer",30000,10,20000);
        System.out.println(runner.saveDetails(lap4));
        Laptop l4= runner.fetchDetailsByBrand("acer");
        System.out.println(l1.toString());

        System.out.println("Laptop 5");
        Laptop lap5=new Laptop("mac",50000,8,20000);
        System.out.println(runner.saveDetails(lap5));
        Laptop l5= runner.fetchDetailsByBrand("mac");
        System.out.println(l5.toString());

        System.out.println("Laptop 6");
        Laptop lap6=new Laptop("apple",80000,16,30000);
        System.out.println(runner.saveDetails(lap6));
        Laptop l6= runner.fetchDetailsByBrand("apple");
        System.out.println(l6.toString());

        System.out.println("Laptop 7");
        Laptop lap7=new Laptop("asus",30000,16,20000);
        System.out.println(runner.saveDetails(lap7));
        Laptop l7= runner.fetchDetailsByBrand("asus");
        System.out.println(l7.toString());

        System.out.println("Laptop 8");
        Laptop lap8=new Laptop("microsoft",30000,8,20000);
        System.out.println(runner.saveDetails(lap8));
        Laptop l8= runner.fetchDetailsByBrand("microsoft");
        System.out.println(l8.toString());

        System.out.println("Laptop 9");
        Laptop lap9=new Laptop("lg",20000,8,20000);
        System.out.println(runner.saveDetails(lap9));
        Laptop l9= runner.fetchDetailsByBrand("lg");
        System.out.println(l1.toString());

        System.out.println("Laptop 10");
        Laptop lap10=new Laptop("samsung",30000,16,20000);
        System.out.println(runner.saveDetails(lap10));
        Laptop l10= runner.fetchDetailsByBrand("samsung");
        System.out.println(l1.toString());

    }
    public boolean saveDetails(Laptop laptop)
    {
        boolean flag=false;
        for(int i=0;i< laptops.length;i++)
        {
            if(laptops[i]==null)
            {
                laptops[i]=laptop;

                flag=true;
                break;
            }
        }
        return flag;
    }
    public Laptop fetchDetailsByBrand(String brand)
    {
        for(int i=0;i<laptops.length;i++)
        {
            if(laptops[i].getBrand()==brand)
            {
                return laptops[i];
            }
        }
        return null;
    }
    public boolean updateRamByBrand(String brand,int ram)
    {
        for(int i=0;i< laptops.length;i++)
        {
            if(laptops[i].getBrand()==brand)
            {
                laptops[i].setRam(ram);
                return true;
            }
        }
        return false;
    }
    public boolean deleteDetails(String brand)
    {
        for(int i=0;i< laptops.length;i++)
        {
            if(laptops[i].getBrand()==brand)
            {
                laptops[i] = null;
                return true;
            }
        }
        return false;
    }
}
