package week8.lesson1.example8;

public class SSDDisk {

    private String name;
    private double volume; // gb

    private int price;

    public SSDDisk(){
        this.name = "No Name";
        this.volume = 0;
    }

    public SSDDisk(String name, double volume, int price) {
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getData(){
        return this.name + " " + this.volume + " GB";
    }
}
