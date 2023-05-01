package week8.lesson1.example3;

public class Main {

    public static void main(String[] args) {

        Gun glock = new Gun();
        glock.setName("Glock 17");
        glock.setBullets(10);
        glock.setCapacity(17);

        System.out.println(glock.getName());

    }
}
