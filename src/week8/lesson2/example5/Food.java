package week8.lesson2.example5;

public class Food {

    private String name;
    private double calories;

    public Food(String name, double calories) {
        this.name = name;
        this.calories = calories;
    }

    public Food(){
        this.name = "No Name";
        this.calories = 0;
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

    public String getData(){
        return this.name + " " + this.calories + " kcal";
    }

    public void eat(){
        System.out.println("I am eating "
                + name + " with calories "
                + calories + " kcal");
    }
}
