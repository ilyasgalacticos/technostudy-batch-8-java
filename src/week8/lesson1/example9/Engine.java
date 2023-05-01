package week8.lesson1.example9;

public class Engine {

    private String name;
    private double engineVolume;
    private int price;

    public Engine(){
        this.name = "No Engine";
        this.price = 0;
        this.engineVolume = 0;
    }

    public Engine(String name, double engineVolume, int price) {
        this.name = name;
        this.engineVolume = engineVolume;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
