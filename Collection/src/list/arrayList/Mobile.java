package list.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Mobile {

    public static void main(String[] args)
    {
        List<Long> mobileNumbers =new ArrayList<Long>();
        System.out.println(mobileNumbers.isEmpty());
        mobileNumbers.add(9480040215l);
        mobileNumbers.add(9876542121l);
        mobileNumbers.add(8465323236l);
        mobileNumbers.add(8656232322l);
        mobileNumbers.add(9865453123l);

        System.out.println(mobileNumbers);

        for(Long ref: mobileNumbers)
        {
            System.out.println(ref);
        }

        System.out.println(mobileNumbers.isEmpty());
        System.out.println(mobileNumbers.size());
        System.out.println(mobileNumbers.get(1));
        System.out.println(mobileNumbers.indexOf(9480040215l));
        System.out.println(mobileNumbers.remove(1));
        System.out.println(mobileNumbers.contains(9865453123l));
        mobileNumbers.set(3,8015346365l);
        mobileNumbers.add(9480040215l);
        System.out.println("index of value is"+ mobileNumbers.indexOf(9480040215l));
        System.out.println(mobileNumbers.lastIndexOf(9480040215l));

        Iterator<Long> iterator = mobileNumbers.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        ListIterator<Long> list = mobileNumbers.listIterator();
        while (list.hasNext())
        {
            System.out.println(list.next());
        }

        while (list.hasPrevious())
        {
            System.out.println(list.previous());// to print in reverse index
        }

    }
}
