package week7.lesson3.example4;

public class Main {
    public static void main(String[] args) {

        Gun glock = new Gun();
        glock.printStatus();

        Gun makarov = new Gun("Makarov's Pistol", 7, 5);
        //makarov.name = "Makarov's Pistol";
        //makarov.bulletsCapacity = 7;
        //makarov.currentBullets = 5;
        makarov.printStatus();

        Gun colt = new Gun("Colt Gold", 7, 7);
        colt.printStatus();
    }
}
