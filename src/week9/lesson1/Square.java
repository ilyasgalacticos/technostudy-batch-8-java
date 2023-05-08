package week9.lesson1;

public class Square extends Shape{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea(){
        return getSide() * getSide();
    }
    @Override
    public double getPerimeter(){
        return getSide() * 4;
    }

}
