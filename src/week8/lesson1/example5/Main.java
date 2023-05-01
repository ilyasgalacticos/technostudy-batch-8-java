package week8.lesson1.example5;

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setName("Iphone 14");
        phone.setPrice(1200);
        phone.setCameraPixels(14);

        System.out.println(phone.getData());
    }
}
