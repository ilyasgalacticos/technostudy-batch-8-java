package week9.lesson2.example6;

public abstract class Game {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void left();
    public abstract void right();
    public abstract void down();
    public abstract void up();
    public abstract void enter();

}
