package week7.lesson3.example3.example2;

public class Main {
    public static void main(String[] args) {

        Gun makarov = new Gun();
        makarov.name = "PM Makarov's Pistol";
        makarov.capacity = 9;
        makarov.currentBullets = 7;

        makarov.printStatus();
        makarov.shot();
        makarov.shot();
        makarov.shot();
        makarov.printStatus();
        makarov.shot();
        makarov.shot();
        makarov.shot();
        makarov.shot();
        makarov.shot();
        makarov.shot();
        makarov.shot();
        makarov.shot();
        makarov.printStatus();
        makarov.reload();
        makarov.reload();
        makarov.printStatus();

        makarov.reload();
        makarov.reload();
        makarov.reload();
        makarov.reload();
        makarov.reload();
        makarov.reload();
        makarov.reload();
        makarov.reload();

        makarov.printStatus();

    }
}
