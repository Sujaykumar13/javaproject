package list.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Countries {

    public static void main(String[] args)
    {
        List<String> country = new LinkedList<>();
        country.add("India");
        country.add("Iceland");
        country.add("Greenland");
        country.add("Australia");
        country.add("Australia");

        System.out.println(country);

        for(String ref: country)
        {
            System.out.println(ref);
        }

        System.out.println(country.isEmpty());
        System.out.println(country.size());
        System.out.println(country.get(1));
        System.out.println(country.indexOf("India"));
        System.out.println(country.remove(4));
        System.out.println(country.contains("Greenland"));
        country.set(3,"Spain");
        country.add("India");
        System.out.println("index of value is"+ country.indexOf("India"));
        System.out.println(country.lastIndexOf("India"));

        Iterator<String> iterator = country.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
    }

