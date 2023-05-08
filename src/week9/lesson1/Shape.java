package week9.lesson1;

public abstract class Shape {

    // For this method I will spend 2 days of coding
    public abstract double getArea();

    // For this method I will spend 2 days of coding
    public abstract double getPerimeter();

    // for this calculation I will spend 2 days of coding
    public void calculatePrice() {
        System.out.println("Price is : " + 123 * 4.56 * getArea() / getPerimeter() + " USD");
    }

}
