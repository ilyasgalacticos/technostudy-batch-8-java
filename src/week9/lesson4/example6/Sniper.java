package week9.lesson4.example6;

public class Sniper implements Weapon, Aimable, Reloadable {

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void takeAim() {
        System.out.println("I am sniper " + getModel() + " taking aim");
    }

    @Override
    public void reload() {
        System.out.println("I am putting bullet into sniper");
    }

    @Override
    public void attack() {
        System.out.println("I am sniper " + getModel() + " shooting");
        reload();
    }
}
