package wrapper;

public class Wrapper {
    public static void main(String[] args)
    {
        System.out.println("int type to Integer wrapper classs");
        int a=10;
        Integer integer = new Integer(a);
        Integer integer1=new Integer("10");
        System.out.println(integer);
        System.out.println(integer1);

        System.out.println("long type to Long wrapper classs");
        long b=100l;
        Long ln=new Long(100l);
        Long ln1=new Long("100");
        System.out.println(ln);
        System.out.println(ln1);

        System.out.println("short type to Short wrapper classs");
        short s=5;
        Short sh=new Short(s);
        Short sh1=new Short("5");
        System.out.println(sh);
        System.out.println(sh1);

        System.out.println("byte type to Byte wrapper classs");
         byte byt=4;
         Byte by=new Byte(byt);
         Byte by1=new Byte(by);
         Byte by2=new Byte("4");
        System.out.println(by1);
        System.out.println(by2);

        System.out.println("float type to Float wrapper classs");
        float f=10.26f;
        Float fl=new Float(f);
        Float fl1=new Float(10.25d);
        Float fl2=new Float("10.25");
        System.out.println(fl);
        System.out.println(fl1);
        System.out.println(fl2);

        System.out.println("double type to Double wrapper classs");
        double d=10.25266;
        Double db =new Double(d);
        Double db1=new Double(10.25f);//implict type cast
        Double db2=new Double("2213.213545");
        System.out.println(db);
        System.out.println(db1);
        System.out.println(db2);

        System.out.println("char type to Char wrapper classs");
        char c='s';
        Character ch=new Character(c);
        //we not able to send String value in Character
        System.out.println(ch);

        System.out.println("boolean type to Boolean wrapper classs");
        boolean res=true;
        Boolean bo=new Boolean(res);
        Boolean bo1=new Boolean("save");//it give false for other than true/false
        System.out.println(bo);
        System.out.println(bo1);

        Boolean bb1=new Boolean("yes");
        Boolean bb2=new Boolean("no");
        System.out.println(bb1.equals(bb2));//equal method is present because Boolean is class and it compare content because equal method is override

        //wrapper clases are immutable
        // tostring,hashcode,equals are override in wrapper class and string class

    }
}
