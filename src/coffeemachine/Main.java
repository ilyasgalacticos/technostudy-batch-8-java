package coffeemachine;

import week9.lesson3.example2.C;

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

        Map<String, CoffeeSize> sizeMenu = new HashMap<>();
        sizeMenu.put("1", CoffeeSize.SMALL);
        sizeMenu.put("2", CoffeeSize.MEDIUM);
        sizeMenu.put("3", CoffeeSize.LARGE);
        sizeMenu.put("4", CoffeeSize.XLARGE);

        while (true) {

            Set<String> keys = coffeeChoice.keySet();

            System.out.println("---------------------------------");
            for (String key : keys) {
                System.out.println(
                        "PRESS [" + key + "] TO CHOOSE " +
                                coffeeChoice.get(key).getType().getName()
                );
            }
            System.out.println("---------------------------------");

            String choice = in.next();
            Coffee myCoffee = coffeeChoice.get(choice);
            if (myCoffee != null) {

                System.out.println(
                        "Your choice is "
                                + myCoffee.getType().getName()
                                + " "
                                + (myCoffee.isCold() ? "Cold" : "Hot")
                );
                if(myCoffee.isCold()){
                    System.out.println("Best way to cool off in a hot summer day... Perfect decision!");
                }

                Set<String> sizeMenuKeys = sizeMenu.keySet();
                System.out.println("Choose size: ");
                for(String key : sizeMenuKeys){
                    System.out.println("PRESS ["+key+"] TO CHOOSE " + sizeMenu.get(key).getName());
                }
                String sizeMenuChoice = in.next();
                myCoffee.setSize(sizeMenu.get(sizeMenuChoice));
                System.out.println("Your " + myCoffee.getSize().getName() + " " + myCoffee.getType().getName() + " is getting prepared…");

            }else{
                System.out.println("Invalid selection. Please press a valid button!");
            }
        }
    }
}
