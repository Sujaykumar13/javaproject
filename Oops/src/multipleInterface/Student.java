package multipleInterface;

public class Student implements Traine1,Traine2{

    String subject;

    public Student(String subject)
    {
       this.subject=subject;
    }
    @Override
    public void test() {

        System.out.println(" writing test for subject "+subject);
    }

    @Override
    public void presentation() {

        System.out.println("doing presentation for subject " +subject);
    }

    @Override
    public void assignment() {

        System.out.println("doing assignment for subject " +subject);
    }
}
