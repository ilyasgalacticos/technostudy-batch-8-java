package week7.lesson3.example2;

public class Gun {
    String name;
    int capacity;
    int currentBullets;

    public void reload() {
        System.out.println("..........................");
        if (currentBullets < capacity) {
            currentBullets = currentBullets + 1;
            System.out.println("Reloading... Added 1 bullet");
            System.out.println("Currently " + currentBullets + " bullets");
        } else {
            System.out.println("Shell is full");
        }
    }

    public void printStatus() {
        System.out.println("..........................");
        System.out.println("Gun " + name + ", capacity: " + capacity + " bullets");
        System.out.println("Current bullet amount: " + currentBullets + " bullets");
    }

    public void shot() {
        System.out.println("..........................");
        if (currentBullets > 0) {
            System.out.println("Baaaam!");
            currentBullets = currentBullets - 1;
        }else{
            System.out.println("Shell is empty!");
        }
    }
}
