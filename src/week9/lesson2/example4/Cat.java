package week9.lesson2.example4;

public class Cat extends Animal{

    private String name;
    private int age;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String getData() {
        return getName() + " " + getAge() + " years old " + getWeight() + " kg";
    }

    @Override
    public void move() {
        System.out.println("I am cat " + getName() + " moving Meow!");
    }
}
