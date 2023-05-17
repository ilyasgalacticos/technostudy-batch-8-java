package week10.lesson3.example3;

import java.util.ArrayList;

public class Main5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Lenovo");
        list.add("ASUS");
        list.add("HP");
        list.add("DELL");
        list.add("MSI");
        System.out.println(list);

        list.set(3, "Toshiba");
        System.out.println(list);

    }
}
