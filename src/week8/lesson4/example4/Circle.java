package week8.lesson4.example4;

public class Circle extends Shape{

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle() {
        super();
        this.radius = 0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return 3.14 * this.radius * this.radius;
    }

    @Override
    public double getPerimeter(){
        return 2 * 3.14 * this.radius;
    }

}
