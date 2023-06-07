package coffeemachine;

public enum CoffeeSize {

    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large"),
    XLARGE("X-Large");

    private String name;

    CoffeeSize(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
