package MethodOverloading;

public class Whatsapp {
    int number;
    String message;
    String emoji;

    public void app(int number)
    {
        this.number=number;
    }
    public void app(int number,String message)
    {
        this.number=number;
        this.message=message;
    }
    public void app(String message,int number)
    {
        this.message=message;
        this.number=number;
    }
    public void app(int number,String message,String emoji)
    {
        this.number=number;
        this.message=message;
        this.emoji=emoji;
    }



    public int getNumber() {
        return number;
    }

    public String getMessage() {
        return message;
    }

    public String getEmoji() {
        return emoji;
    }
    public static void main(String[] args)
    {
        Whatsapp app = new Whatsapp();
        app.app(94800402);
        app.app(94800401,"hii");
        app.app("hi",94856165);
        app.app(94586521,"hii","smile");
        System.out.println(app.getNumber());
        System.out.println(app.getMessage());
        System.out.println(app.getEmoji());
    }

}
