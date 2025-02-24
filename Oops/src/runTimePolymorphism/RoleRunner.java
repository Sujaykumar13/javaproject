package runTimePolymorphism;

public class RoleRunner {
    public static void main(String[] args)
    {
        Person runner=new Father();
        runner.role();
        Person runner1 = new Person();
        runner1.role();
    }
}
