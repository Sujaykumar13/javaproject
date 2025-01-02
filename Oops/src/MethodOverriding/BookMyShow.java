package MethodOverriding;

public class BookMyShow {
    public BookMyShow()
    {
        System.out.println("parent class");
    }
    private int seatNo;

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public int getSeatNo() {
        return seatNo;
    }
    public void feature()
    {
        System.out.println("we can book tickets");
    }
}
