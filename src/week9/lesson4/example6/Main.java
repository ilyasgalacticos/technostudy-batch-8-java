package week9.lesson4.example6;

public class Main {
    public static void main(String[] args) {

        Pistol glock = new Pistol();
        glock.setName("Glock 17");
        glock.setBullets(5);

        Sniper sniper = new Sniper();
        sniper.setModel("M21");

        Knife knife = new Knife();
        knife.setName("Rambo");
        knife.setLength(25);

        Weapon weapons[] = {glock, sniper, knife};
        for (int i = 0; i < weapons.length; i++) {
            if (weapons[i] instanceof Reloadable) {
                weapons[i].attack();
                ((Reloadable) weapons[i]).reload();
            } else {
                weapons[i].attack();
            }
        }

        glock.attack();
        glock.attack();
        glock.attack();
        glock.attack();
        glock.attack();
        glock.attack();
        glock.attack();
        glock.attack();
        glock.attack();
        glock.attack();
        glock.attack();
        glock.attack();
        glock.attack();
        glock.attack();
        glock.attack();
        glock.attack();
        glock.attack();
        glock.attack();
        glock.attack();
        glock.attack();
        glock.attack();

        glock.reload();
        glock.attack();
        glock.attack();
        glock.attack();
        glock.attack();
        glock.attack();

    }
}
