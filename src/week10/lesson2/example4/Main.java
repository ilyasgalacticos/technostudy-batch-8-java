package week10.lesson2.example4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Mercedes");
        car.setSpeed(300);

        try {
            car.ride();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("I have finished");
    }
}
