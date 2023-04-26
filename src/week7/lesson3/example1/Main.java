package week7.lesson3.example1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Phone p1 = new Phone();
        // p1 is an object
        // Phone is a class
        //setting up the values of properties
        p1.name = "Iphone";
        p1.model = "13 Pro Max";
        p1.memory = 256 * 1024;
        p1.camera = 12;

        Phone p2 = new Phone();
        p2.name = "XIAOMI";
        p2.model = "REDMI NOTE 10";
        p2.memory = 128 * 1024;
        p2.camera = 11;

        p1.printPhoneData();
        p2.printPhoneData();

        p1.takePicture();
        p1.takePicture();
        p1.takePicture();

        p2.takeVideo(20);
        p2.takeVideo(300);

        p1.printPhoneData();
        p2.printPhoneData();
    }
}
