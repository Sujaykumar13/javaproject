package list.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Adhar {

    public static void main(String[] args)
    {
        List<Long> adhar = new LinkedList<>();
        adhar.add(123265358974L);
        adhar.add(879654512245L);
        adhar.add(658675645321L);
        adhar.add(545421212122L);
        adhar.add(875452424212L);

        System.out.println(adhar);

        for(Long ref: adhar)
        {
            System.out.println(ref);
        }

        System.out.println(adhar.isEmpty());
        System.out.println(adhar.size());
        System.out.println(adhar.get(1));
        System.out.println(adhar.indexOf(658675645321L));
        System.out.println(adhar.remove(4));
        System.out.println(adhar.contains(545421212122L));
        adhar.set(3,867455656354L);
        adhar.add(658675645321L);
        System.out.println("index of value is"+ adhar.indexOf(658675645321L));
        System.out.println(adhar.lastIndexOf(658675645321L));

        Iterator<Long> iterator = adhar.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
