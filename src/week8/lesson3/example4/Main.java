package week8.lesson3.example4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Laptop laptop = new Laptop();
        laptop.setName("Lenovo");
        laptop.setRam(8);
        laptop.setSsd(512);

        AsusLaptop asusLaptop = new AsusLaptop();
        asusLaptop.setVideoCardMemory(8);
        asusLaptop.setRam(16);
        asusLaptop.setSsd(512);
        asusLaptop.setName("ASUS TUF GAMING");

        MacBookLaptop macBookLaptop = new MacBookLaptop();
        macBookLaptop.setIos("12.v");
        macBookLaptop.setName("Mac Book Pro 21");
        macBookLaptop.setSsd(256);
        macBookLaptop.setRam(8);

        // Godfather     - Corleone's
        Laptop[] shop = {macBookLaptop, asusLaptop, laptop};

        // Polymorphism!
        for (int i = 0; i < shop.length; i++) {
            shop[i].turnOn();
        }

        // Polymorphism!
        for (int i = 0; i < shop.length; i++) {
            shop[i].turnOff();
        }
    }
}
