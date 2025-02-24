package objectClass;

public class ApplicationRunner {
    public static void main(String[] args)
    {
        Application app=new Application(1,"Whatsapp");
        System.out.println(app.toString());
        System.out.println(app.hashCode());

        Application app1=new Application(2,"Instagram");
        System.out.println(app1.toString());
        System.out.println(app1.hashCode());

        Application app2=new Application(1,"Whatsapp");
        System.out.println(app2.toString());
        System.out.println(app2.hashCode());
        System.out.println(app2==app);
        System.out.println(app2.equals(app));
        System.out.println(app2.equals(app1));


    }
}
