package list.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Letters {

    public static void main(String[] args)
    {
        List<Character> letter = new LinkedList<>();
        letter.add('a');
        letter.add('b');
        letter.add('c');
        letter.add('d');
        letter.add('e');

        System.out.println(letter);

        for(Character ref: letter)
        {
            System.out.println(ref);
        }

        System.out.println(letter.isEmpty());
        System.out.println(letter.size());
        System.out.println(letter.get(1));
        System.out.println(letter.indexOf('a'));
        System.out.println(letter.remove(4));
        System.out.println(letter.contains('d'));
        letter.set(3,'g');
        letter.add('a');
        System.out.println("index of value is"+ letter.indexOf('a'));
        System.out.println(letter.lastIndexOf('a'));

        Iterator<Character> iterator = letter.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
