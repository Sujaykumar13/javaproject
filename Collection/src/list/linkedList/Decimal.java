package list.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Decimal {

    public static void main(String[] args)
    {
        List<Double> deci = new LinkedList<>();
        deci.add(10.2656);
        deci.add(543.2656);
        deci.add(65564.2534586);
        deci.add(2543521.265654);
        deci.add(2315.245866);

        System.out.println(deci);

        for(Double ref: deci)
        {
            System.out.println(ref);
        }

        System.out.println(deci.isEmpty());
        System.out.println(deci.size());
        System.out.println(deci.get(1));
        System.out.println(deci.indexOf(543.2656));
        System.out.println(deci.remove(4));
        System.out.println(deci.contains(2315.245866));
        deci.set(3,86745.56563);
        deci.add(543.2656);
        System.out.println("index of value is"+ deci.indexOf(543.2656));
        System.out.println(deci.lastIndexOf(543.2656));

        Iterator<Double> iterator = deci.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
