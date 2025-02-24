package en;

public class Days {
    private Week day;

    public Week getDay() {
        return day;
    }

    public void setDay(Week day) {
        this.day = day;
    }
    public void daySelector(){
        switch (day){
            case Monday: System.out.println("Day is Monday");
                          break;
            case Tuesday: System.out.println("Day is Tuesday");
                          break;
            case Wednesday: System.out.println("Day is Wednesday");
                          break;
            case Thursday: System.out.println("Day is Thursday");
                          break;
            case Friday: System.out.println("Day is friday");
                          break;
            case Saturday: System.out.println("Day is Saturday");
                          break;
            case Sunday: System.out.println("Day is sunday");
                         break;

        }
    }
}
