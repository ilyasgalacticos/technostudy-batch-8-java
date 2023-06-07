package coffeemachine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<String, Coffee> coffeeChoice = new HashMap();
        coffeeChoice.put("1", new Coffee(CoffeeType.AMERICANO, false));
        coffeeChoice.put("2", new Coffee(CoffeeType.ESPRESSO, false));
        coffeeChoice.put("3", new Coffee(CoffeeType.CAPPUCCINO, false));
        coffeeChoice.put("4", new Coffee(CoffeeType.LATTE, false));
        coffeeChoice.put("5", new Coffee(CoffeeType.MOCHA, false));
        coffeeChoice.put("6", new Coffee(CoffeeType.MACCHIATO, false));
        coffeeChoice.put("7", new Coffee(CoffeeType.AFFOGATO, false));
        coffeeChoice.put("8", new Coffee(CoffeeType.ICED_COFFEE, true));
        coffeeChoice.put("9", new Coffee(CoffeeType.FRAPPUCCINO, true));
        coffeeChoice.put("10", new Coffee(CoffeeType.IRISH_COFFEE, false));

        while (true) {

            Set<String> keys = coffeeChoice.keySet();

            for(String key : keys){
                System.out.println(
                        "PRESS [" + key +"] TO CHOOSE " +
                        coffeeChoice.get(key).getType().getName()
                );
            }

            String choice = in.next();
            Coffee myCoffee = coffeeChoice.get(choice);
            System.out.println("---------------------------------");
            System.out.println(
                    "Your choice is "
                            + myCoffee.getType().getName()
                            + " "
                            + (myCoffee.isCold() ? "Cold" : "Hot")
            );
            System.out.println("---------------------------------");
        }
    }
}
