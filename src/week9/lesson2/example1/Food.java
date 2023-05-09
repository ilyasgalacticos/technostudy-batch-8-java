package week9.lesson2.example1;

public abstract class Food {

    public abstract double getCalories();

    public void printData() {
        System.out.println("My food has " + getCalories() + " kcal");
    }
}
