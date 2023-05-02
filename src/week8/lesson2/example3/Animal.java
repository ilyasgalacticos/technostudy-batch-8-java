package week8.lesson2.example3;

public class Animal {

    private String name;
    private int age;
    private double weight;

    public Animal(){
        this.name = "No Name";
        this.age = 0;
        this.weight = 0;
    }

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void eat(){
        System.out.println(
                "I am an animal "
                        + this.name
                        + " with age " + this.age + " years old and with weight "
                        + this.weight + " kg eating"
        );
    }

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
}
