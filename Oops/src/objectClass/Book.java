package objectClass;

public class Book {
    private String name;
    private String author;
    private int price;

    public Book(String name,String author,int price)
    {
        this.name=name;
        this.author=author;
        this.price=price;
    }

    @Override
    public String toString() {
        return "name of the book is "+name+", written by"+author+"and price is"+price;
    }

    @Override
    public int hashCode() {
        int hash=15;
        hash=25*hash+this.name.hashCode();
        hash=25*hash+this.author.hashCode();
        hash=25*hash+this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null)
        {
            return false;
        }
        if(obj instanceof Book)
        {
            Book book= (Book) obj;
            if(this.name.equals(book.name)&&this.author.equals(book.author)&&this.price==book.price)
            {
                return true;
            }
        }
        return false;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("this is finalize method");
        super.finalize();
    }
}
