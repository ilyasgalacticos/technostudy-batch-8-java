package week7.lesson2.example3;

public class Animal {
    String name;
    double weight;
    int age;
    String color;

    public void run() {
        System.out.println("I am " + color + " colored animal " + name
                + " with weight " + weight + " kg and I am " + age + " years old " +
                "and I am running!");
    }

    public void eat(){
        System.out.println("I am " + color + " colored animal " + name
                + " with weight " + weight + " kg and I am " + age + " years old " +
                "and I am eating food!");
    }
}
