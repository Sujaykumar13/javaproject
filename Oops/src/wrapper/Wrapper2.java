package wrapper;

public class Wrapper2 {
    public static void main(String[] args)
    {
        System.out.println("converting String to primitive int type");
        int stringToInt=Integer.parseInt("10");
        System.out.println(stringToInt);

        System.out.println("converting String to primitive byte type");
        byte stringToByte=Byte.parseByte("4");
        System.out.println(stringToByte);

        System.out.println("converting String to primitive short type");
        short stringToShort=Short.parseShort("3");
        System.out.println(stringToByte);

        System.out.println("converting String to primitive long type");
       // long stringToLong=Long.parseLong("10l");not possible
        long stringToLong=Long.parseLong("10");
        System.out.println(stringToLong);

        System.out.println("converting String to primitive float type");
        float stringToFloat=Float.parseFloat("20.25");
        float stringToFloat1=Float.parseFloat("20.25f");
        float stringToFloat2=Float.parseFloat("20.25d");
        System.out.println(stringToFloat);
        System.out.println(stringToFloat1);
        System.out.println(stringToFloat2);

        System.out.println("converting String to primitive double type");
        double stringToDouble=Double.parseDouble("6232.542");
        double stringToDouble1=Double.parseDouble("6232.542f");
        double stringToDouble2=Double.parseDouble("6232.542d");
        System.out.println(stringToDouble);
        System.out.println(stringToDouble1);
        System.out.println(stringToDouble2);

        System.out.println("converting String to primitive char type");
        //char StringTOChar=Character.parseChar() character class not contain parsechar

        System.out.println("converting String to primitive boolean type");
        boolean stringToBoolean =Boolean.parseBoolean("true");
        boolean stringToBoolean1 =Boolean.parseBoolean("yes");
        System.out.println(stringToBoolean);
        System.out.println(stringToBoolean1);

        //autoboxing
        Integer a=10;// internally return as Integer a =Integer.valueof(10)
        System.out.println(a);

        //autounboxing
        int b=a;//internally return as int b=a.intValue();
        System.out.println(b);

    }
}
