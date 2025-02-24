package array;

public class Product {
    static String[] product =new String[5];
    public static void main(String[] args)
    {
        Product pro=new Product();

        System.out.println(pro.save("homemade"));
        System.out.println(pro.fetchProduct("homemade"));
        System.out.println(pro.fetchProduct("bottle"));
        System.out.println(pro.save("bottle"));
        System.out.println(pro.fetchProduct("homemade"));
        System.out.println(pro.fetchProduct("bottle"));
        System.out.println(pro.updateProduct("glass",0));
        System.out.println(pro.fetchProduct("glass"));
        System.out.println(pro.save("homemade"));
        System.out.println(pro.fetchProduct("homemade"));
        System.out.println(pro.deleteProduct("homemade"));
        System.out.println(pro.fetchProduct("homemade"));
        System.out.println(pro.save("groceries"));
        System.out.println(pro.fetchProduct("groceries"));
        System.out.println(pro.save("ice cream"));
        System.out.println(pro.fetchProduct("ice cream"));
        System.out.println(pro.save("mobile"));
        System.out.println(pro.fetchProduct("mobile"));
        System.out.println(pro.save("homemade"));
        System.out.println(pro.fetchProduct("homemade"));

    }
    public boolean save(String products)
    {
        boolean flag=false;
        for(int i=0;i< product.length;i++)
        {
            if(product[i]==null)
            {
                product[i]=products;
                flag=true;
                break;
            }
        }
        return flag;
    }
    public String fetchProduct(String products)
    {
        for(int i=0;i< product.length;i++)
        {
            if(product[i]==products)
            {
                return product[i];
            }
        }
        return null;
    }
    public boolean updateProduct(String products,int i)
    {
        if(i<product.length)
        {
            product[i]=products;
            return true;
        }
        return false;
    }
    public boolean deleteProduct(String products)
    {
        boolean flag=false;
        for(int i=0;i< product.length;i++)
        {
            if(product[i]==products)
            {
                product[i]=null;
                flag=true;
                break;
            }
        }
        return flag;
    }

}
