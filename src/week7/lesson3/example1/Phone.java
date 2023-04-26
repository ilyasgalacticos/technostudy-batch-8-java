package week7.lesson3.example1;

public class Phone {

    String name;
    String model;
    int memory;
    double camera;

    public void printPhoneData() {
        System.out.println("------------------------");
        System.out.println(name + " " + model);
        System.out.println("Camera: " + camera + " mpx");
        System.out.println("Remaining memory: " + memory + " MB");
    }

    public void takePicture() {
        System.out.println("....................................");
        System.out.println("I am taking picture with " + name + " - " + model);
        System.out.println("My camera data is " + camera + " mpx");
        memory = memory - 17;
    }

    public void takeVideo(int seconds) {
        System.out.println("....................................");
        System.out.println("I am taking video with " + name + " - " + model);
        System.out.println("My camera data is " + camera + " mpx");
        memory = memory - 77 * seconds;
    }
}
