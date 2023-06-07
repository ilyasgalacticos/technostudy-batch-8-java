package coffeemachine;

public enum CoffeeType {

    AMERICANO("Americano", false),
    ESPRESSO("Espresso", false),
    CAPPUCCINO("Cappuccino", false),
    LATTE("Latte", false),
    MOCHA ("Mocha", false),
    MACCHIATO ("Macchiato", false),
    AFFOGATO ("Affogato", false),
    ICED_COFFEE ("Iced Coffee", true),
    FRAPPUCCINO ("Frappuccino", true),
    IRISH_COFFEE ("Irish Coffee", false);

    private String name;
    private boolean cold;

    CoffeeType(String name, boolean cold){
        this.name = name;
        this.cold = cold;
    }

    public String getName() {
        return name;
    }

    public boolean isCold() {
        return cold;
    }
}
