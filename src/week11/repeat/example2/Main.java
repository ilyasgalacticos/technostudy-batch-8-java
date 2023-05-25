package week11.repeat.example2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Ilyas"); // names[0] = "Ilyas";
        names.add("John"); //  names[1] = "John";

        System.out.println(names.size()); // current size of list, names.length
        System.out.println(names.get(1)); // names[0]

        names.add("Jack");
        names.add("Sarah");

        System.out.println(names);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        for(String name : names){
            System.out.println(name);
        }

    }
}
