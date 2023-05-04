package week8.lesson4.example1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Monitor monitor = new Monitor();
        // We are creating new instance of class Monitor, object
        monitor.name = "LG";
        monitor.height = 30;
        monitor.width = 90;
        monitor.resolution = "1024x480";

        monitor.turnOn();

        Monitor apple = new Monitor();
        apple.name = "Apple iMac";
        apple.resolution = "2048x960";
        apple.width = 110;
        apple.height = 60;

        apple.turnOn();
    }
}