package wrapper;

public class Wrapper3 {
    public static void main(String[] args)
    {
        Integer a= Integer.valueOf(10);
        System.out.println("converting Integer object to string");
        String integerToString=a.toString();
        System.out.println(integerToString);

        Byte b=Byte.valueOf((byte) 4);
        System.out.println("converting Byte object to string");
        String byteToString=b.toString();
        System.out.println(byteToString);

        Short s=Short.valueOf((short) 4);
        System.out.println("converting Short object to string");
        String shortToString=s.toString();
        System.out.println(shortToString);

        Long l=Long.valueOf(100);
        System.out.println("converting Long object to string");
        String longTOString=l.toString();
        System.out.println(longTOString);

        Float f= Float.valueOf(1000.25f);
        System.out.println("converting Float object to string");
        String floatTOString=f.toString();
        System.out.println(floatTOString);

        Double d=Double.valueOf(10.2356);
        System.out.println("converting Double object to string");
        String doubleToString=d.toString();
        System.out.println(doubleToString);

        Character c=Character.valueOf('a');
        System.out.println("converting Character object to string");
        String characterToString=c.toString();
        System.out.println(characterToString);
        //we can convert character to string but string to character is not posssible

        Boolean bl= Boolean.valueOf(true);
        System.out.println("converting Boolean object to string");
        String booleanToString=bl.toString();
        System.out.println(booleanToString);
        
    }
}
