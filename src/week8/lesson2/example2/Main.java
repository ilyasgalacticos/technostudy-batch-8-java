package week8.lesson2.example2;

public class Main {

    public static void main(String[] args) {

        Animal a = new Animal(); // Creating object of Animal
        //a.name = "Dog"; // givng access to parameters directly
        //a.weight = 4; // How can I set and get that parameters?!
        a.setName("Dog");
        a.setWeight(4);

        System.out.println(a.getName());

        a.setName("Puppy");
        a.setWeight(2);

        System.out.println(a.getName() + " " + a.getWeight() + " kg");

    }

}
