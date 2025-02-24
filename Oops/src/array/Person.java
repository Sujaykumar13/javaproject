package array;
//Data transfer object file

public class Person {
    private int id;
    private String name;
    private String place;
    private String email;
    public Person(int id,String name,String place,String email)
    {
        this.id=id;
        this.name=name;
        this.place=place;
        this.email=email;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPlace() {
        return place;
    }

    @Override
    public String toString()
    {
        return "id-"+id+"name-"+ name +" email-"+email+"place-"+place;
    }
}
