package list.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class City {

    public static void main(String[] args)
    {
        List<Integer> numbers=new ArrayList<Integer>();
        //Collection<Integer> numbers=new ArrayList<Integer>();only we get collection methods not getting list methods
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        System.out.println(numbers);

        for(Integer ref:numbers)
        {
            System.out.println(ref);
        }

       // for(Object ref1:numbers)//itirating the values
       // {
          //  int i = Integer.parseInt(numbers.toString());
          //  System.out.println(i);
       // }

        System.out.println(numbers.size());
        System.out.println(numbers.get(1));
        System.out.println(numbers.indexOf(5));
        System.out.println(numbers.remove(1));
        System.out.println(numbers.contains(10));

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext())//hashnext() is used to move to next iterator/index//we need to use only while loop
        {
            System.out.println(iterator.next());//next() is used to move to next values
            // System.err.println(iterator.next());//to show error msg
            //we can use out or err any one in print statement
        }



    }
}
