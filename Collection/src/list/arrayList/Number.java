package list.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Number {

    public static void main(String[] args)
    {
        List<Integer> numbers=new ArrayList<Integer>();
        System.out.println(numbers.isEmpty());
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println(numbers);

        for(Integer ref:numbers)
        {
            System.out.println(ref);
        }

        System.out.println(numbers.isEmpty());
        System.out.println(numbers.size());
        System.out.println(numbers.get(1));
        System.out.println(numbers.indexOf(50));
        System.out.println(numbers.remove(1));
        System.out.println(numbers.contains(10));
        numbers.set(3,60);
        numbers.add(50);
        System.out.println("index of value is"+numbers.indexOf(50));
        System.out.println(numbers.lastIndexOf(50));

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
