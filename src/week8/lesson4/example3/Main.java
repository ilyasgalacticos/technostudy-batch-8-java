package week8.lesson4.example3;

public class Main {

    public static void main(String[] args) {

        Shape shape = new Shape("Triangle", 40, 20);
        shape.draw();

        Circle circle = new Circle("Circle from me", 50, 30, 5);
        shape.draw();

    }

}
