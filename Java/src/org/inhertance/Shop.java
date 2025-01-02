package org.inhertance;

public class Shop extends Mall{
    public void owner()
    {
        System.out.println("owner is xyz");
    }
    public static void main(String[] args)
    {
        Mall mall =new Mall();
        mall.setName("Orion");
        System.out.println(mall.getName());
        Shop shop=new Shop();
        shop.setName("puma");
        System.out.println(shop.getName());
        shop.setType("sports wear");
        System.out.println(shop.gettype());
        shop.setDimension(1200);
        System.out.println(shop.getDimension());
        shop.opening();
        shop.owner();
    }
}
