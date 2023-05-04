package week8.lesson4.example3;

public class Circle extends Shape{
    private int radius;

    public Circle() {
        super();
        this.radius = radius;
    }

    public Circle(String name, int perimeter, int area, int radius) {
        super(name, perimeter, area);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw(){
        System.out.println("I am circle " + getName());
        System.out.println("My radius is " + getRadius());
        System.out.println("My area is " + getArea() + ", " + getPerimeter());
    }
}
