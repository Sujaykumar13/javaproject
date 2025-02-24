package ab;

public class Circle implements Shape{
    private int radius;
    public static final double PIE=3.14;
    public Circle(int radius)
    {
        this.radius=radius;
    }
    @Override
    public double area() {
        return PIE*radius*radius;
    }
}
