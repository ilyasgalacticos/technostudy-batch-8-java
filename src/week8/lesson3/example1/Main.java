package week8.lesson3.example1;

public class Main {
    public static void main(String[] args) {
        A a = new A(); // I created an object of A class
        a.x = 10;
        a.y = "Hello";
        a.toPrintData();

        B b = new B();
        b.x = 55;
        b.y = "Hi";

        b.toPrintData();
    }
}
