package list.linkedList;

import java.util.LinkedList;
import java.util.List;

public class City {
    public static void main(String[] args)
    {
        List<String> list = new LinkedList<>();
        list.add("bangalore");
        list.add("mysore");
        list.add("mangalore");
        list.add("mandya");

        System.out.println(list);

        System.out.println(list.size());
    }
}
