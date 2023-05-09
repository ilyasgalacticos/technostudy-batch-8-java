package week9.lesson2.example3;

public class MCDonalds extends Restaurant{

    private int workers; //2500
    private int burgers; //5
    private int drinks; //3
    private int iceCreams; //4

    public int getWorkers() {
        return workers;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }

    public int getBurgers() {
        return burgers;
    }

    public void setBurgers(int burgers) {
        this.burgers = burgers;
    }

    public int getDrinks() {
        return drinks;
    }

    public void setDrinks(int drinks) {
        this.drinks = drinks;
    }

    public int getIceCreams() {
        return iceCreams;
    }

    public void setIceCreams(int iceCreams) {
        this.iceCreams = iceCreams;
    }

    @Override
    public double getTotalIncome() {
        return burgers * 5 + iceCreams * 4 + drinks * 3;
    }

    @Override
    public double getTotalOutcome() {
        return workers * 2500;
    }
}
