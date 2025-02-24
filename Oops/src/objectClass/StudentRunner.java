package objectClass;

public class StudentRunner {
    public static void main(String[] args)
    {
        Student student=new Student(1,"sujay");
        System.out.println(student.toString());
        System.out.println(student.hashCode());

        Student student1=new Student(2,"sneha");
        System.out.println(student1.toString());
        System.out.println(student1.hashCode());

        Student student2=new Student(1,"sujay");
        System.out.println(student2.toString());
        System.out.println(student2.hashCode());
        System.out.println(student2==student1);
        System.out.println(student2.equals(student));
        System.out.println(student2.equals(student1));
    }
}
