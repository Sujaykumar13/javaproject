package MethodOverriding;

public class WhatsappUpdate extends Whatsapp{
    public WhatsappUpdate()
    {
        System.out.println("child class");
    }
    public void message()
    {
        System.out.println("whatsapp updated to send msg and to voice call");
    }
    public void emoji()
    {
        System.out.println("whatsapp updated to send emoji and stickers");
    }
    public static void main(String[] args)
    {
        WhatsappUpdate update=new WhatsappUpdate();
        update.message();
        update.emoji();
    }
}
