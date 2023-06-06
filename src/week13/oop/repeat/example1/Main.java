package week13.oop.repeat.example1;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.price = 2000;
        laptop.screenDimension = 15.6;
        System.out.println(laptop.getSum(3,4));
    }
}
