package array;

public class Adhar {
    private int num;
    private String name;
    private int mobile;
    private int age;
    public Adhar(int num,String name,int mobile,int age)
    {
       this.num=num;
       this.name=name;
       this.mobile=mobile;
       this.age=age;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMobile() {
        return mobile;
    }
    public String toString()
    {
        return "adhar num-"+num+"name-"+name+"age-"+age+"mobile-"+mobile;
    }

}
