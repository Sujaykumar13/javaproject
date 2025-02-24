package list.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Decimal {

    public static void main(String[] args)
    {
        List<Float> deci =new ArrayList<Float>();
        System.out.println(deci.isEmpty());
        deci.add(10.2f);
        deci.add(2.25f);
        deci.add(330.25f);
        deci.add(4055.5f);
        deci.add(5.2f);

        System.out.println(deci);

        for(Float ref: deci)
        {
            System.out.println(ref);
        }

        System.out.println(deci.isEmpty());
        System.out.println(deci.size());
        System.out.println(deci.get(1));
        System.out.println(deci.indexOf(4055.5f));
        System.out.println(deci.remove(1));
        System.out.println(deci.contains(5.2f));
        deci.set(3,6025.45f);
        deci.add(4055.5f);
        System.out.println("index of value is"+ deci.indexOf(4055.5f));
        System.out.println(deci.lastIndexOf(4055.5f));

        Iterator<Float> iterator = deci.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
