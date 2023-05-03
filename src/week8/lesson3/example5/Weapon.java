package week8.lesson3.example5;

public class Weapon {

    private String name;

    public Weapon(){
        this.name = "No Name";
    }

    public Weapon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(){
        System.out.println(this.name + " is shooting");
    }

}
