package week8.lesson3.example2;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.setX(100);
        a.setY("Hello");

        a.toPrintData();

        B b = new B();
        b.setX(400);
        b.setY("Hi");
        b.setZ(88);

        b.toPrintData();
    }
}
