package week9.lesson2.example3;

public abstract class Restaurant {

    public abstract double getTotalIncome();

    public abstract double getTotalOutcome();

    public double getTax() {
        return (getTotalIncome() - getTotalOutcome()) * 0.25;
    }
}
