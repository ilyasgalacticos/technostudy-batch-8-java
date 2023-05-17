package week10.lesson3.example2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Messi");
        names.add("Ronaldo");
        names.add("Ilyas");
        names.add("John");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i)); // names[i];
        }

        // foreach
        for (String elem : names){
            System.out.println(elem);
        }
    }
}
