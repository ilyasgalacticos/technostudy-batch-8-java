package week7.lesson2.example2;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        // c1 - is an object of Car class!
        // Scanner in = new Scanner(System.in);// we created 'in' object of 'Scanner' class
        c1.name = "Mercedes";
        c1.speed = 240;
        c1.price = 15000;

        Car c2 = new Car();
        c2.name = "Tesla";
        c2.speed = 190;
        c2.price = 90000;

        System.out.println(c1.name + " for " + c1.price + " dollars with max speed " + c1.speed + " km/h");
        System.out.println(c2.name + " for " + c2.price + " dollars with max speed " + c2.speed + " km/h");

        c1.ride();
        c2.ride();
    }
}
