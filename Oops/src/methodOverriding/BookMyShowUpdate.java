package methodOverriding;

public class BookMyShowUpdate extends BookMyShow {
    int moviePrice;
    public BookMyShowUpdate(int moviePrice)
    {
        System.out.println("child class");
        this.moviePrice=moviePrice;
    }
    public void feature()
    {
        System.out.println("we can book tickets and buy the movie");
    }

    public int getMoviePrice() {
        return moviePrice;
    }
    public static void main(String[] args)
    {
        BookMyShowUpdate book = new BookMyShowUpdate(400);
        System.out.println(book.getMoviePrice());
        book.feature();
        book.setSeatNo(25);
        System.out.println(book.getSeatNo());


    }
}
