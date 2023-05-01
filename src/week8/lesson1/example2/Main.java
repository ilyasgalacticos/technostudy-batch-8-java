package week8.lesson1.example2;

import week8.lesson1.example1.Car;
public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();
        //c1.name = "Ferrari";
        c1.setName("Porsche");
        c1.setEngineVolume(3.5);
        c1.setMaxSpeed(350);

        c1.printData();

        System.out.println(c1.getName());
        System.out.println(c1.getMaxSpeed());
        System.out.println(c1.getEngineVolume());

    }
}
