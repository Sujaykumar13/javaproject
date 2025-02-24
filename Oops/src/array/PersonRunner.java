package array;

public class PersonRunner {
    Person[] persons = new Person[10];
    public static void main(String[] args)
    {
        PersonRunner runner=new PersonRunner();
        System.out.println("person 1");
        Person person1=new Person(1,"sujay","mysore","sujay@gmail.com");
        System.out.println(runner.saveDetails(person1));
        Person per1=runner.fetchDetailsByEmail("sujay@gmail.com");
        System.out.println(per1.toString());
        System.out.println(runner.updateNameByEmail("sujay@gmail.com","sneha"));
        System.out.println(per1.toString());
        System.out.println(runner.deleteDetails("sujay@gmail.com"));
        Person d=runner.fetchDetailsByEmail("sujay@gmail.com");//we get null pointer exception
        // System.out.println(d.toString());

        System.out.println("person 2");
        Person person2=new Person(2,"rahul","mysore","rahul@gmail.com");
        System.out.println(runner.saveDetails(person2));
        Person p2=runner.fetchDetailsByEmail("rahul@gmail.com");
        System.out.println(p2.toString());

        System.out.println("person 3");
        Person person3=new Person(3,"ram","bangalore","ram@gmail.com");
        System.out.println(runner.saveDetails(person3));
        Person p3=runner.fetchDetailsByEmail("ram@gmail.com");
        System.out.println(p3.toString());

        System.out.println("person 4");
        Person person4=new Person(4,"virat","delhi","virat@gmail.com");
        System.out.println(runner.saveDetails(person4));
        Person p4=runner.fetchDetailsByEmail("virat@gmail.com");
        System.out.println(p4.toString());

        System.out.println("person 5");
        Person person5=new Person(5,"jane","hawkins","jane@gmail.com");
        System.out.println(runner.saveDetails(person5));
        Person p5=runner.fetchDetailsByEmail("jane@gmail.com");
        System.out.println(p5.toString());

        System.out.println("person 6");
        Person person6=new Person(6,"el","hawkins","el@gmail.com");
        System.out.println(runner.saveDetails(person6));
        Person p6=runner.fetchDetailsByEmail("el@gmail.com");
        System.out.println(p6.toString());

        System.out.println("person 7");
        Person person7=new Person(7,"smith","sydney","smith@gmail.com");
        System.out.println(runner.saveDetails(person7));
        Person p7=runner.fetchDetailsByEmail("smith@gmail.com");
        System.out.println(p7.toString());

        System.out.println("person 8");
        Person person8=new Person(8,"starc","mysore","starc@gmail.com");
        System.out.println(runner.saveDetails(person8));
        Person p8=runner.fetchDetailsByEmail("starc@gmail.com");
        System.out.println(p8.toString());

        System.out.println("person 9");
        Person person9=new Person(9,"lucus","hawkins","lucus@gmail.com");
        System.out.println(runner.saveDetails(person9));
        Person p9=runner.fetchDetailsByEmail("lucus@gmail.com");
        System.out.println(p2.toString());

        System.out.println("person 10");
        Person person10=new Person(10,"mike","mysore","mike@gmail.com");
        System.out.println(runner.saveDetails(person10));
        Person p10=runner.fetchDetailsByEmail("mike@gmail.com");
        System.out.println(p10.toString());

    }
    public boolean saveDetails(Person person)
    {
        boolean flag=false;
        for(int i=0;i< persons.length;i++)
        {
            if(persons[i]==null)
            {
                persons[i]=person;

                flag=true;
                break;
            }
        }
        return flag;
    }
    public Person fetchDetailsByEmail(String email)
    {
        for(int i=0;i<persons.length;i++)
        {
            if(persons[i] !=null && persons[i].getEmail()==email)
            {
                return persons[i];
            }
        }
        return null;
    }
    public boolean updateNameByEmail(String email,String name)
    {
        for(int i=0;i< persons.length;i++)
        {
            if(persons[i]!=null && persons[i].getEmail()==email)
            {
                persons[i].setName(name);
                return true;
            }
        }
        return false;
    }
    public boolean deleteDetails(String email)
    {
        for(int i=0;i< persons.length;i++)
        {
            if(persons[i]!=null && persons[i].getEmail()==email)
            {
                persons[i] = null;
                return true;
            }
        }
        return false;
    }

}
