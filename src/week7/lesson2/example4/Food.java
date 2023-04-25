package week7.lesson2.example4;

public class Food {

    String name;
    int price;
    double calories;
    double weight;
    boolean vegetarian;

    public String getFoodData(){
        return name + ", " + price + " USD, "
                + calories + " kcal, " + weight + " kg, "
                + "is vegetarian = " + vegetarian;
    }
}
