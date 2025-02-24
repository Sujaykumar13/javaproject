package list.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Name {

    public static void main(String[] args)
    {
        List<String> name =new ArrayList<String>();
        System.out.println(name.isEmpty());
        name.add("sujay");
        name.add("sneha");
        name.add("rahul");
        name.add("tom");
        name.add("thor");

        System.out.println(name);

        for(String ref: name)
        {
            System.out.println(ref);
        }

        System.out.println(name.isEmpty());
        System.out.println(name.size());
        System.out.println(name.get(1));
        System.out.println(name.indexOf("sujay"));
        System.out.println(name.remove(4));
        System.out.println(name.contains("tom"));
        name.set(3,"cruise");
        name.add("sujay");
        System.out.println("index of value is"+ name.indexOf("sujay"));
        System.out.println(name.lastIndexOf("sujay"));

        Iterator<String> iterator = name.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
