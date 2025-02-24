package exception;

public class Student {
    int marks;

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
    public static void main(String[] args)
    {
        System.out.println("student record");
        int passMarks=35;
        Student student=new Student();
        student.setMarks(25);
        try{if(student.getMarks()>=passMarks)
        {
            System.out.println("student is pass");
        }
        else
        {
            throw new NoMinimumMarksException("marks is less than 35");
        }}catch(NoMinimumMarksException e)
        {
            e.printStackTrace();
        }
        System.out.println("exception is handled");

    }
}
