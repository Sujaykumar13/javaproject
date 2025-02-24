package array;

public class Email {

    static String[] email=new String[5];

    public static void main(String[] args)
    {
        Email email=new Email();
        System.out.println(email.save("xyz@gmail.com"));
        System.out.println(email.fetchEmail("xyz@gmail.com"));
        System.out.println(email.fetchEmail("sujay@gmail.com"));
        System.out.println(email.save("sujay@gmail.com"));
        System.out.println(email.fetchEmail("xyz@gmail.com"));
        System.out.println(email.fetchEmail("sujay@gmail.com"));
        System.out.println(email.updateEmail("sneha@gmail.com",0));
        System.out.println(email.fetchEmail("sneha@gmail.com"));
        System.out.println(email.save("xyz@gmail.com"));
        System.out.println(email.fetchEmail("xyz@gmail.com"));
        System.out.println(email.deleteEmail("xyz@gmail.com"));
        System.out.println(email.fetchEmail("xyz@gmail.com"));
        System.out.println(email.save("rahul@gmail.com"));
        System.out.println(email.fetchEmail("rahul@gmail.com"));
        System.out.println(email.save("tom@gmail.com"));
        System.out.println(email.fetchEmail("tom@gmail.com"));
        System.out.println(email.save("thor@gmail.com"));
        System.out.println(email.fetchEmail("thor@gmail.com"));
        System.out.println(email.save("odinson@gmail.com"));
        System.out.println(email.fetchEmail("odinson@gmail.com"));
    }
    public boolean save(String emails)
    {
        boolean flag=false;
        for(int i=0;i< email.length;i++)
        {
            if(email[i]==null)
            {
               email[i]=emails;
               flag=true;
                break;
            }
        }
        return flag;
    }
    public String fetchEmail(String emails)
    {
        for(int i=0;i< email.length;i++)
        {
            if(email[i]==emails)
            {
                return email[i];
            }
        }
        return null;
    }
    public boolean updateEmail(String emails,int i)
    {
       if(i<email.length)
       {
           email[i]=emails;
           return true;
       }
       return false;
    }
    public boolean deleteEmail(String emails)
    {
        boolean flag=false;
        for(int i=0;i< email.length;i++)
        {
            if(email[i]==emails)
            {
                email[i]=null;
                flag=true;
                break;
            }
        }
        return flag;
    }

}
