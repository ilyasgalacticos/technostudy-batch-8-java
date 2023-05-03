package week8.lesson3.example3;

public class Main {
    public static void main(String[] args) {

        IPhone iPhone = new IPhone();
        iPhone.setMemory(128);
        iPhone.setCameraPixels(14);

        IPhone12 iPhone12 = new IPhone12();
        iPhone12.setColor("Blue");
        iPhone12.setMemory(256);
        iPhone12.setCameraPixels(15);

        IPhone13 iPhone13 = new IPhone13();
        iPhone13.setMemory(512);
        iPhone13.setColor("Gold");
        iPhone13.setPrice(1200);
        iPhone13.setCameraPixels(16);

    }
}
