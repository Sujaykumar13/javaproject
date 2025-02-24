package clone;
//Deep cloning
public class Book implements Cloneable{//clonable is marker interface because it doesnot contains methods
    String bookName;
    String color;
    int noOfPages;

    Author author;

    public Book(String bookName,String color,int noOfPages,Author author)
    {
        this.bookName=bookName;
        this.color=color;
        this.noOfPages=noOfPages;
        this.author=author;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Author author=new Author("stephan","USA");
        Book book=new Book("theory of everything","white",154,author);
        //before cloning
        System.out.println(book.bookName);
        System.out.println(book.color);
        System.out.println(book.noOfPages);
        System.out.println(book.author.name);
        System.out.println(book.author.place);
        //cloning the object
        Book book1= (Book) book.clone();
        //changing the values in Author
        book1.author.place="America";
        book1.author.name="hawkings";
        //after cloning and changing in clone object
        System.out.println(book1.bookName);
        System.out.println(book1.color);
        System.out.println(book1.noOfPages);
        System.out.println(book1.author.name);
        System.out.println(book1.author.place);
        //printing values original object values after changing in clone object
        System.out.println(book.author.name);
        System.out.println(book.author.place);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Author a= new Author(this.author.name,this.author.place);
        Book b=new Book(this.bookName,this.color,this.noOfPages,a);    
        return b;
    }
}
