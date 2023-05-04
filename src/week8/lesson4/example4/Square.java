package week8.lesson4.example4;

public class Square extends Shape{

    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public Square() {
        super();
        this.side = 0;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea(){
        return this.side * this.side;
    }

    @Override
    public double getPerimeter(){
        return 4 * this.side;
    }
}
