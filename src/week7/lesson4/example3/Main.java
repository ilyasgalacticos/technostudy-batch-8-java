package week7.lesson4.example3;

public class Main {
    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes", "E280", 220, 40);
        System.out.println(mercedes.fuel);
        mercedes.ride(100);
        System.out.println(mercedes.fuel);
        mercedes.ride(100);
        mercedes.ride(100);
        System.out.println(mercedes.fuel);
        mercedes.ride(100);
        System.out.println(mercedes.fuel);
        mercedes.ride(20);
        System.out.println(mercedes.fuel);
        mercedes.ride(10);
        System.out.println(mercedes.fuel);
        mercedes.ride(10);
        System.out.println(mercedes.fuel);
    }
}
