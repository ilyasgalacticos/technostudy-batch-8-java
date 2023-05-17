package week10.lesson3.example3;

import java.util.ArrayList;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<String> phones = new ArrayList<>();
        phones.add("Iphone"); // 0
        phones.add("XIAOMI"); // 1
        phones.add("Samsung");// 2
        phones.add("Meizu");  // 3
        phones.add("Nokia");  // 4

        System.out.println(phones);

        phones.add("Blackberry");// 5

        System.out.println(phones);

        phones.add(2, "Huawei"); // adds element into position 2
        System.out.println(phones);

        phones.add(0, "LG");
        System.out.println(phones);

    }
}
