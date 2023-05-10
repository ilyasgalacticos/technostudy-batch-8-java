package week9.lesson3.example1;

public class Square implements Shape{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return getSide() * getSide();
    }
    @Override
    public double getPerimeter() {
        return 4 * getSide();
    }
}
