package week9.lesson4.example6;

public class Pistol implements Weapon, Reloadable{

    private String name;
    private int bullets; // 20

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBullets() {
        return bullets;
    }

    public void setBullets(int bullets) {
        this.bullets = bullets;
    }

    @Override
    public void attack() {
        if(getBullets()>0){
            System.out.println("I am pistol "
                    + getName() + " with "
                    + getBullets() + " bullets firing");
            setBullets(getBullets()-1);
        }else{
            System.out.println("My pistol is empty!");
        }
    }

    @Override
    public void reload() {
        System.out.println("I am reloading " + getName());
        setBullets(20);
    }
}
