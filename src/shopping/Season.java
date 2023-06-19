package shopping;

public enum Season {

    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");

    Season(String name){
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }
}
