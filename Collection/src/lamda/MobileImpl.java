package lamda;

public class MobileImpl implements Mobile{
    @Override
    public int mobileId(int number) {
        System.out.println("this is implimentation class");
        return number;
    }
}
