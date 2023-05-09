package week9.lesson2.example3;

public class KFC extends Restaurant {
    private int chickenLegs; // 3 USD
    private int chickenWings; // 2 USD
    private int workers;

    public int getChickenLegs() {
        return chickenLegs;
    }

    public void setChickenLegs(int chickenLegs) {
        this.chickenLegs = chickenLegs;
    }

    public int getChickenWings() {
        return chickenWings;
    }

    public void setChickenWings(int chickenWings) {
        this.chickenWings = chickenWings;
    }

    public int getWorkers() {
        return workers;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }

    @Override
    public double getTotalIncome() {
        return 2 * chickenWings + 3 * chickenLegs;
    }

    @Override
    public double getTotalOutcome() {
        return workers * 3000;
    }
}
