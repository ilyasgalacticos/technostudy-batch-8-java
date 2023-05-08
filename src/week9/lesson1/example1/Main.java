package week9.lesson1.example1;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setRadius(5);

        Square square = new Square();
        square.setSide(7);

        circle.calculatePrice();
        square.calculatePrice();

    }

}
