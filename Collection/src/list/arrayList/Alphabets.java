package list.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Alphabets {

    public static void main(String[] args)
    {
        List<Character> alpha =new ArrayList<Character>();
        System.out.println(alpha.isEmpty());
        alpha.add('A');
        alpha.add('B');
        alpha.add('C');
        alpha.add('D');
        alpha.add('E');
        //arraylist allows duplicate and null values 

        System.out.println(alpha);

        for(Character ref: alpha)
        {
            System.out.println(ref);
        }

        System.out.println(alpha.isEmpty());
        System.out.println(alpha.size());
        System.out.println(alpha.get(1));
        System.out.println(alpha.indexOf('A'));
        System.out.println(alpha.remove(4));
        System.out.println(alpha.contains('C'));
        alpha.set(3,'E');
        alpha.add('A');
        System.out.println("index of value is"+ alpha.indexOf('A'));
        System.out.println(alpha.lastIndexOf('A'));

        Iterator<Character> iterator = alpha.iterator();

        while (iterator.hasNext())
        {
            System.err.println(iterator.next());
        }

        List<Character> alpha1 =new ArrayList<Character>();
        System.out.println(alpha.isEmpty());
        alpha1.add('A');
        alpha1.add('B');
        alpha1.add('C');
        alpha1.add('D');
        alpha1.add('E');

        List alpha2 =new ArrayList();

        alpha2.add(alpha);//it not applicable for generic
        alpha2.add(alpha1);//it will add as different object with different array
        System.out.println(alpha2);

        alpha2.addAll(alpha);
        alpha2.addAll(alpha1);//it will add for same array
        System.out.println(alpha2);
        alpha2.add("H");

        System.out.println(alpha2);



    }
}
