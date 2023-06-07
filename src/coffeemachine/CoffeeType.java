package coffeemachine;

public enum CoffeeType {

    AMERICANO("Americano"),
    ESPRESSO("Espresso"),
    CAPPUCCINO("Cappuccino"),
    LATTE("Latte"),
    MOCHA ("Mocha"),
    MACCHIATO ("Macchiato"),
    AFFOGATO ("Affogato"),
    ICED_COFFEE ("Iced Coffee"),
    FRAPPUCCINO ("Frappuccino"),
    IRISH_COFFEE ("Irish Coffee");

    private String name;

    CoffeeType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
