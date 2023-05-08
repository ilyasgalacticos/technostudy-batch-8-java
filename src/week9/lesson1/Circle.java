package week9.lesson1;

public class Circle extends Shape{

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    // 2 days for implementing this method
    @Override
    public double getArea(){
        return 3.14 * getRadius() * getRadius();
    }

    // 2 days for implementing this method
    @Override
    public double getPerimeter(){
        return 2 * 3.14 * getRadius();
    }

}
