package week8.lesson2.example5;

public class Pizza extends Food {

    private int diameter;

    public Pizza() {
        setName("No Name Pizza");
        setCalories(0);
        this.diameter = 0;
    }

    public Pizza(String name, double calories, int diameter) {
        this.diameter = diameter;
        setName(name);
        setCalories(calories);
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getData(){
        return getName() + " with diameter " + getDiameter() + " cm, " + getCalories() + " kcal";
    }

    public void eat(){
        System.out.println("I am eating Pizza "
                + getName() + " with diameter "
                + getDiameter() + " cm "
                + getCalories() + " kcal"
        );
    }

}
