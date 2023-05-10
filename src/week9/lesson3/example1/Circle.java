package week9.lesson3.example1;

public class Circle implements Shape{

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * getRadius() * getRadius();
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * getRadius();
    }
}
