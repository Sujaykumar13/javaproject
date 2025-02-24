package objectClass;

import java.lang.reflect.Method;

public class CarRunner {
    public static void main(String[] args)
    {
        Car car =new Car("jaquar","sedan",16562156);
        System.out.println(car.toString());
        System.out.println(car.hashCode());

        Car car1 =new Car("ferarri","sedan",265622020);
        System.out.println(car1.toString());
        System.out.println(car1.hashCode());

        Car car2 =new Car("jaquar","sedan",16562156);
        System.out.println(car2.toString());
        System.out.println(car2.hashCode());
        System.out.println(car2.equals(car));
        System.out.println(car2.equals(car1));

        classRefference(car);

        car1=null;
         System.gc();

    }
    public static void classRefference(Object obj)
    {
        System.out.println("Object class method - getClass");
        Class classObject=obj.getClass();
        System.out.println(classObject.getName());
        Method[] methods=classObject.getMethods();
        System.out.println(methods.length);
        for (Method method : methods) {
            System.out.println(method);

        }
        for(int i=0;i<methods.length;i++)
        {
            System.out.println(methods[i]);
        }
    }
}
