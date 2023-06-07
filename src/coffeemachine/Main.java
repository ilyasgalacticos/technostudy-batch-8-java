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
        coffeeChoice.put("a", new Coffee(CoffeeType.AMERICANO, false));
        coffeeChoice.put("b", new Coffee(CoffeeType.ESPRESSO, false));
        coffeeChoice.put("c", new Coffee(CoffeeType.CAPPUCCINO, false));
        coffeeChoice.put("d", new Coffee(CoffeeType.LATTE, false));
        coffeeChoice.put("e", new Coffee(CoffeeType.MOCHA, false));
        coffeeChoice.put("f", new Coffee(CoffeeType.MACCHIATO, false));
        coffeeChoice.put("g", new Coffee(CoffeeType.AFFOGATO, false));
        coffeeChoice.put("h", new Coffee(CoffeeType.ICED_COFFEE, true));
        coffeeChoice.put("i", new Coffee(CoffeeType.FRAPPUCCINO, true));
        coffeeChoice.put("j", new Coffee(CoffeeType.IRISH_COFFEE, false));
        coffeeChoice.put("k", new Coffee(CoffeeType.TURKISH_COFFEE, false));

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
                if (myCoffee.isCold()) {
                    System.out.println("Best way to cool off in a hot summer day... Perfect decision!");
                }

                Set<String> sizeMenuKeys = sizeMenu.keySet();
                System.out.println("Choose size: ");
                for (String key : sizeMenuKeys) {
                    System.out.println("PRESS [" + key + "] TO CHOOSE " + sizeMenu.get(key).getName());
                }
                String sizeMenuChoice = in.next();
                if (sizeMenu.get(sizeMenuChoice) != null) {
                    myCoffee.setSize(sizeMenu.get(sizeMenuChoice));
                    System.out.println("Your " + myCoffee.getSize().getName() + " " + myCoffee.getType().getName() + " is getting prepared...");

                    System.out.println("Would you like to add milk to your " + myCoffee.getType().getName() + "?" +
                            " Please type 'YES' if you want milk\n" +
                            "with your " + myCoffee.getType().getName() + " or 'NO' if you don’t want.");

                    String milkChoice = in.next();
                    myCoffee.setWithMilk(milkChoice.equalsIgnoreCase("YES"));

                    if (myCoffee.isWithMilk()) {
                        System.out.println("Milk is being added to your " + myCoffee.getType().getName() + "... Please be patient.");
                    } else {
                        System.out.println("Your " + myCoffee.getType().getName() + " is being prepared without milk.");
                    }

                    System.out.println("Would you like any sugar to your " + myCoffee.getType().getName() + "?" +
                            " (Type 'YES' if you want sugar and 'NO' if\n" +
                            "you don’t want to.");
                    String sugarChoice = in.next();
                    myCoffee.setWithSugar(sugarChoice.equalsIgnoreCase("YES"));

                    if (myCoffee.isWithSugar()) {
                        System.out.println("How many sugar would you like?");
                        try {
                            int sugars = in.nextInt();
                            myCoffee.setSugars(sugars);
                        }catch (Exception e){
                            in.next();
                            myCoffee.setSugars(1);
                        }

                    } else {
                        System.out.println("Your coffee is being prepared without sugar...");
                    }

                    if (!myCoffee.isWithMilk() && myCoffee.isWithSugar()) {
                        System.out.println("Your " + myCoffee.getSize().getName() + " " + myCoffee.getType().getName() +
                                " is being prepared without milk and with " + myCoffee.getSugars() + " " +
                                "cube(s) of sugar.");
                    } else if (!myCoffee.isWithMilk() && !myCoffee.isWithSugar()) {
                        System.out.println("Your " + myCoffee.getSize().getName() + " " + myCoffee.getType().getName() +
                                " is being prepared without milk and sugar.");
                    } else if (myCoffee.isWithMilk() && myCoffee.isWithSugar()) {
                        System.out.println("Your " + myCoffee.getSize().getName() + " " + myCoffee.getType().getName() +
                                " is being prepared with milk and " + myCoffee.getSugars() + " cube(s) " +
                                "of sugar");
                    } else if(myCoffee.isWithMilk() && !myCoffee.isWithSugar()){
                        System.out.println("Your " + myCoffee.getSize().getName() + " " + myCoffee.getType().getName() +
                                " is being prepared with milk, no sugar will be added");
                    }

                }


            } else {
                System.out.println("Invalid selection. Please press a valid button!");
            }
        }
    }
}
