package ab;

public class ShapeRunner {
    public static void main(String[] args)
    {
        Shape circle=new Circle(10);
        double areaCircle= circle.area();
        System.out.println(areaCircle);
        Shape rectangle=new Rectangle(15,10);
        double areaRectangle= rectangle.area();
        System.out.println(areaRectangle);
    }
}
