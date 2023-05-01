package week8.lesson1.example1;

import week8.lesson1.example2.Human;

public class Main {
    public static void main(String[] args) {

        Human h1 = new Human();
        h1.setFullName("John Smith");
        h1.setAge(23);
        h1.setWeight(80);
        h1.setHeight(181);

        System.out.println(h1.getData());

    }
}
