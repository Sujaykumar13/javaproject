package lamda;

import java.util.function.Predicate;

public class PredicateLamda {
    public static void main(String[] args)
    {
        Predicate<Integer> lambdaPredicate = (Integer x) -> (x % 2 == 0);
        boolean value=lambdaPredicate.test((int) 30.0);

        System.out.println(value);
    }

}
