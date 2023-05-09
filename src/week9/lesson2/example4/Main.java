package week9.lesson2.example4;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.setName("New York Central");

        Cat c1 = new Cat();
        c1.setName("Tom");
        c1.setAge(4);
        c1.setWeight(2);

        Cat c2 = new Cat();
        c2.setName("Garfield");
        c2.setAge(5);
        c2.setWeight(7);

        Dog d1 = new Dog();
        d1.setNick("Spike");
        d1.setType("Labrador");
        d1.setBarkingSound("Wooof");

        Dog d2 = new Dog();
        d2.setNick("Rex");
        d2.setType("German");
        d2.setBarkingSound("Booof");

        Animal[] animals = {c1, d1, c2, d2};
        zoo.setAnimals(animals);

        zoo.moveAll();

        for (int i = 0; i < zoo.getAnimals().length; i++) {
            System.out.println(zoo.getAnimals()[i].getData());
        }

    }
}
