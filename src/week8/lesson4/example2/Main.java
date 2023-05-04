package week8.lesson4.example2;

import week8.lesson4.example2.Airplane;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        airplane.setName("Boeing 747");
        airplane.setPassengers(300);
        airplane.setMaxSpeed(1200);
        airplane.fly();

        Airplane a1 = new Airplane();
        a1.fly();

        Airplane a2 = new Airplane("Airbus A380", 300, 1200);

    }
}
