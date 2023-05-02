package week8.lesson2.example3;

public class Main {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.setName("Some Animal");
        a.setWeight(5);
        a.setAge(3);
        a.eat();

        Dog d = new Dog();
        d.setName("Spike");
        d.setAge(4);
        d.setWeight(10);
        d.setBarkStyle("Woof");
        d.setVaccinated(false);

        d.eat();

        Cat c = new Cat();
        c.setName("Tom");
        c.setLives(7);
        c.setColor("blue");
        c.setAge(12);
        c.setWeight(3);

        c.eat();

    }
}
