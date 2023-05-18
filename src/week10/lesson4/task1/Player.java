package week10.lesson4.task1;

public class Player {

    private String name;
    private float price;
    private int age;

    public Player(){
    }

    public Player(String name, float price, int age) {
        this.name = name;
        this.price = price;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return this.name + " " + this.price + " euros, " + this.age + " years old";
    }
}
