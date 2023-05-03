package week8.lesson3.example5;

public class Pistol extends Weapon {

    private int bullets;

    public Pistol() {
        super();
        this.bullets = 0;
    }

    public Pistol(String name, int bullets) {
        super(name);
        this.bullets = bullets;
    }

    public int getBullets() {
        return bullets;
    }

    public void setBullets(int bullets) {
        this.bullets = bullets;
    }

    @Override
    public void attack() {
        if (this.bullets > 0) {
            System.out.println(
                    getName() + " has " + this.bullets + " bullets, BAAAH!"
            );
            this.bullets = this.bullets - 1;
        }else{
            System.out.println("Pistol is empty!");
        }
    }
}
