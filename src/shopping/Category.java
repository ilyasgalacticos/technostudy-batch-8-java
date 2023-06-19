package shopping;

public enum Category {

    ELECTRONICS("Electronics Apps"),
    CLOTHING("Clothing"),
    BOOKS("Books Store");

    Category(String name){
        this.name = name;
    }
    private String name;
    public String getName(){
        return this.name;
    }

}
