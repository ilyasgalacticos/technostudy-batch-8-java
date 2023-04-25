package week7.lesson2.example3;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.name = "Dog";
        a1.color = "yellow";
        a1.age = 5;
        a1.weight = 4.6;

        Animal a2 = new Animal();
        a2.name = "Cat";
        a2.color = "white";
        a2.weight = 2.5;
        a2.age = 2;

        Animal a3 = new Animal();
        a3.name = "Horse";
        a3.color = "brown";
        a3.age = 3;
        a3.weight = 850;

        Animal[] zoo = new Animal[3]; // Array of Animal class
        zoo[0] = a1;
        zoo[1] = a2;
        zoo[2] = a3;

        for(int i = 0; i < zoo.length; i++){
            zoo[i].run();
        }
    }
}
