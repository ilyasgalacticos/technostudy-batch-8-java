package week8.lesson3.example5;

public class Knife extends Weapon {

    private int length;

    public Knife() {
        super();
        this.length = 0;
    }

    public Knife(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void attack(){
        System.out.println("Knife " + getName()
                + " with length " + this.length + " cm is cutting");
    }

}
