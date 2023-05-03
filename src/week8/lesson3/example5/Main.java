package week8.lesson3.example5;

public class Main {

    public static void main(String[] args) {

        Weapon weapon = new Weapon();
        weapon.setName("Baseball Beat");

        Pistol glock = new Pistol();
        glock.setName("Glock 17");
        glock.setBullets(20);

        Knife knife = new Knife();
        knife.setName("Kenzi");
        knife.setLength(25);

        Weapon[] weapons = {weapon, glock, knife};
        for (int i = 0; i < weapons.length; i++) {
            weapons[i].attack();
        }

    }

}
