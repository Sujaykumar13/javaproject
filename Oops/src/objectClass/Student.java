package objectClass;

public class Student {
    private int id;
    private String name;

    public Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "student id is  "+id+" and student name is"+name;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null)
        {
            return false;
        }
        if(obj instanceof Student)
        {
            Student student= (Student) obj;
            if(this.id==student.id && this.name.equals(student.name))
            {
                return true;
            }
        }
        return false;
    }
}
