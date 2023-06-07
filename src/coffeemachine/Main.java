package coffeemachine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<String, CoffeeType> coffeeMap = new HashMap();


        while (true) {

            System.out.println();

            String choice = in.next();

            if (choice.equals("0")) {
                break;
            } else {
                System.out.println("Invalid selection. Please press a valid button!");
            }

        }
    }
}
