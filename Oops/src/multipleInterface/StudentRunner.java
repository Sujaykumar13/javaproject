package multipleInterface;

public class StudentRunner {
    public static void main(String[] args)
    {
        Traine1 t1=new Student("java");
        t1.test();
        t1.assignment();
        Student s1= (Student) t1;//we are doing downcasting because presentation is not present in Traine1
        s1.presentation();

        Traine2 t2 =new Student("python");
        t2.test();
        t2.presentation();
        Student s2= (Student) t2;//we are doing downcasting because presentation is not present in Traine1
        s2.assignment();
    }
}
