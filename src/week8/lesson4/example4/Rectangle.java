package week8.lesson4.example4;

public class Rectangle extends Shape{

    private double height;
    private double width;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
        super();
        this.height = 0;
        this.width = 0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea(){
        return this.height * this.width;
    }

    @Override
    public double getPerimeter(){
        return 2 * (this.height + this.width);
    }
}
