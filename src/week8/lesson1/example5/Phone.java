package week8.lesson1.example5;

public class Phone {
    private final int ram = 8;
    private String name;
    private int price;
    private double cameraPixels;

    public Phone() {
        this.name = "No name";
        this.price = 0;
        this.cameraPixels = 0;
    }

    public Phone(String name, int price, double cameraPixels) {
        this.name = name;
        this.price = price;
        this.cameraPixels = cameraPixels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getCameraPixels() {
        return cameraPixels;
    }

    public void setCameraPixels(double cameraPixels) {
        this.cameraPixels = cameraPixels;
    }

    public String getData(){
        return this.name + " "
                + this.cameraPixels + " px, "
                + this.price + " USD, "
                + this.ram + " GB";
    }
}
