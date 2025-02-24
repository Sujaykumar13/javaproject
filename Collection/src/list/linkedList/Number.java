package list.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Number {

    public static void main(String[] args)
    {
        List<Byte> num = new LinkedList<Byte>();//byte/generic inside linkedlist/arraylist is optional
        num.add((byte) 1);
        num.add((byte) 2);
        num.add((byte) 3);
        num.add((byte) 4);
        num.add((byte) 5);

        System.out.println(num);

        for(Byte ref: num)
        {
            System.out.println(ref);
        }

        System.out.println(num.isEmpty());
        System.out.println(num.size());
        System.out.println(num.get(1));
        System.out.println(num.indexOf((byte)1));
        System.out.println(num.remove(4));
        System.out.println(num.contains((byte)2));
        num.set(3, (byte) 6);
        num.add((byte) 1);
        System.out.println("index of value is"+ num.indexOf((byte)1));
        System.out.println(num.lastIndexOf((byte)1));

        Iterator<Byte> iterator = num.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
