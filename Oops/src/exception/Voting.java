package exception;

public class Voting {
    int age;
    public Voting(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }
    public static void main(String[] args)
    {
        Voting vote=new Voting(15);
        if(vote.getAge()>18)
        {
            System.out.println("eligible for voting");
        }
        else {
            throw new NoteligibleException("not eligible for voting because age is less than 18");
        }
    }
}
