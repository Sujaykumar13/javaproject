package objectClass;

public class SpaceRunner {
    public static void main(String[] args)
    {
        Space space = new Space("milkyway", 1, 1365362303);
        System.out.println(space.toString());
        System.out.println(space.hashCode());

        Space space1 = new Space("adarnodaa", 2, 236537784);
        System.out.println(space1.toString());
        System.out.println(space1.hashCode());

        Space space2 = new Space("milkyway", 1, 1365362303);
        System.out.println(space2.toString());
        System.out.println(space2.hashCode());
        System.out.println(space2==space);
        System.out.println(space2.equals(space));
        System.out.println(space2.equals(space1));
    }
}
//class.forname() -creating object another way  