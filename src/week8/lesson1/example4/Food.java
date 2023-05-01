package week8.lesson1.example4;

public class Food {

    private String name;
    private double calories;
    private double weight;
    private int price;

    public Food(){
        this.name = "Default Food Name";
        this.price = 0;
        this.calories = 0;
        this.weight = 0;
    }

    public Food(String name, double calories, double weight, int price) {
        this.name = name;
        this.calories = calories;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
