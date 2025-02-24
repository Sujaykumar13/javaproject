package objectClass;

public class CourseRunner {
    public static void main(String[] args)
    {
        Course course=new Course(1,"Development");
        System.out.println(course.toString());
        System.out.println(course.hashCode());

        Course course1=new Course(2,"Testing");
        System.out.println(course1.toString());
        System.out.println(course1.hashCode());

        Course course2=new Course(1,"Development");
        System.out.println(course2.toString());
        System.out.println(course2.hashCode());
        System.out.println(course2==course);
        System.out.println(course2.equals(course));
        System.out.println(course2.equals(course1));
    }
}
