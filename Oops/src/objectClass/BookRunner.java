package objectClass;

import java.lang.reflect.Method;

public class BookRunner {
    public static void main(String[] args)
    {
        Book book=new Book("theory of everything","stephan",200);
        System.out.println(book.toString());
        System.out.println(book.hashCode());
        Book book1=new Book("Brief history of time","stephan",200);
        System.out.println(book1.toString());
        System.out.println(book1.hashCode());
        Book book2=new Book("theory of everything","stephan",200);
        System.out.println(book.toString());
        System.out.println(book.hashCode());
        System.out.println(book.equals(book2));
        System.out.println(book.equals(book1));
        classRefference(book);

        book1=null;//derefferce of object

        System.gc();//garbage collection


    }
    public static void classRefference(Object obj)
    {
       Class classObject=obj.getClass();
        System.out.println(classObject.getName());
        Method[] methods=classObject.getMethods();
        System.out.println(methods.length);
        for(int i=0;i<methods.length;i++)
        {
            System.out.println(methods[i]);
        }
    }
}
