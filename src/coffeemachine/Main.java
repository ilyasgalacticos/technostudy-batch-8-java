package coffeemachine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<String, CoffeeType> coffeeChoice = new HashMap();
        coffeeChoice.put("a", CoffeeType.AMERICANO);
        coffeeChoice.put("b", CoffeeType.ESPRESSO);
        coffeeChoice.put("c", CoffeeType.CAPPUCCINO);
        coffeeChoice.put("d", CoffeeType.LATTE);
        coffeeChoice.put("e", CoffeeType.MOCHA);
        coffeeChoice.put("f", CoffeeType.MACCHIATO);
        coffeeChoice.put("g", CoffeeType.AFFOGATO);
        coffeeChoice.put("h", CoffeeType.ICED_COFFEE);
        coffeeChoice.put("j", CoffeeType.FRAPPUCCINO);
        coffeeChoice.put("k", CoffeeType.IRISH_COFFEE);

        while (true) {

            Set<String> keys = coffeeChoice.keySet();

            for(String key : keys){
                System.out.println(
                        "PRESS [" + key +"] TO CHOOSE " +
                        coffeeChoice.get(key).getName()
                );
            }

            String choice = in.next();
            CoffeeType myCoffee = coffeeChoice.get(choice);
            System.out.println("---------------------------------");
            System.out.println(
                    "Your choice is "
                            + myCoffee.getName()
                            + " "
                            + (myCoffee?"Cold" : "Hot")
            );
            System.out.println("---------------------------------");
        }
    }
}
