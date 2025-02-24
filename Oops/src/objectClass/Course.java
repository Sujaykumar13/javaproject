package objectClass;

public class Course {
    private int courseId;
    private String courseName;

    public Course(int courseId,String courseName)
    {
        this.courseId=courseId;
        this.courseName=courseName;
    }

    @Override
    public String toString() {
        return "course id is "+courseId+"and name of the course is "+courseName;
    }

    @Override
    public int hashCode() {
        return courseId;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null)
        {
            return false;
        }
        if(obj instanceof Course)
        {
            Course course= (Course) obj;
            if(this.courseId==course.courseId && this.courseName.equals(course.courseName))
            {
                return true;
            }
        }
        return false;
    }
}
