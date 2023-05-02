package week8.lesson2.example3;

public class Cat extends Animal{

    private int lives;
    private String color;

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat(){
        System.out.println(
                "I am cat " + getName() + " "
                        + getAge() + " years old "
                        + getWeight() + " kg "
                        + getColor() + " colored "
                        + "I have " + getLives() + " lives, Meoooow!");
    }
}
