package polymorphism;

public class Whatsapp {
    public void message(String text)
    {
        System.out.println("we can send text in message");
    }
    public void message(String text,String img)
    {
        System.out.println("we can send text and image in message");
    }
    public void message(String text,String img,String emoji)
    {
        System.out.println("we can share img and emoji along with text in message");
    }
    public void message(String text,int number)
    {
        System.out.println("we can send both text and number in message");
    }
}
