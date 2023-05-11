package week9.lesson4.example6;

public class Knife implements Weapon{

    private int length;
    private String name;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("I am knife "
                + getName() + " is attacking with length "
                + getLength() + " cm"
        );
    }
}
