package wrapper;

public class Wrapper1 {
    public static void main(String[] args)
    {
        System.out.println("converting primitive type to wrapper object");

        System.out.println("short type to Short wrapper classs");
        Short shortWrapper=Short.valueOf((short) 5);//we need to explicitly typecast from int to short
        Short shortWrapper1=Short.valueOf( "5");
        System.out.println(shortWrapper);
        System.out.println(shortWrapper1);

        System.out.println("byte type to Byte wrapper classs");
        Byte byteWrapper=Byte.valueOf((byte) 4);//explicit typecast from int byte
        Byte byteWrapper1=Byte.valueOf("4");
        System.out.println(byteWrapper);
        System.out.println(byteWrapper1);

        System.out.println("int type to Integer wrapper classs");
        Integer intWrapper=Integer.valueOf(10);
        Integer intWrapper1=Integer.valueOf("10");
        System.out.println(intWrapper);
        System.out.println(intWrapper1);

        System.out.println("long type to Long wrapper classs");
        Long longWrapper = Long.valueOf(100);
        Long longWrapper1 = Long.valueOf("100");
        System.out.println(longWrapper);
        System.out.println(longWrapper1);

        System.out.println("float type to Float wrapper classs");
        Float floatWrapper=Float.valueOf(10.255f);
       // Float floatWrapper1=Float.valueOf(10.255);not able gice double value
        Float floatWrapper2=Float.valueOf("10.265f");
        System.out.println(floatWrapper);
        System.out.println(floatWrapper2);

        System.out.println("double type to Double wrapper classs");
        Double doubleWrapper=Double.valueOf(10.25566);
        Double doubleWrapper1=Double.valueOf(10.25566f);
        Double doubleWrapper2=Double.valueOf("10.25566");
        System.out.println(doubleWrapper);
        System.out.println(doubleWrapper1);
        System.out.println(doubleWrapper2);

        System.out.println("char type to Character wrapper classs");
        Character characterWrapper=Character.valueOf('s');
        System.out.println(characterWrapper);

        System.out.println("boolean type to Boolean wrapper classs");
        Boolean booleanWrapper=Boolean.valueOf(true);
        Boolean booleanWrapper1=Boolean.valueOf("false");
        System.out.println(booleanWrapper);
        System.out.println(booleanWrapper);

        System.out.println("coverting Wrapper object into primitive type");

        System.out.println("coverting Byte wrapper object into byte type");
        byte b=byteWrapper.byteValue();
        System.out.println(b);  

        System.out.println("coverting Short wrapper object into short type");
        short s=shortWrapper.shortValue();
        short s1=shortWrapper.byteValue();//geting bytevalue in short wrapper
        System.out.println(s);
        System.out.println(s1);

        System.out.println("coverting Integer wrapper object into int type");
        int a=intWrapper.intValue();
        System.out.println(a);

        System.out.println("coverting Long wrapper object into long type");
        long l= longWrapper.longValue();
        System.out.println(l);

        System.out.println("coverting Float wrapper object into float type");
        float f= floatWrapper.floatValue();
        System.out.println(f);

        System.out.println("coverting Double wrapper object into double type");
        double d=doubleWrapper.doubleValue();
        System.out.println(d);

        System.out.println("coverting Character wrapper object into char type");
        char c=characterWrapper.charValue();
        System.out.println(c);

        System.out.println("coverting Boolean wrapper object into boolean type");
        boolean b1= booleanWrapper.booleanValue();
        System.out.println(b1);
    }
}
