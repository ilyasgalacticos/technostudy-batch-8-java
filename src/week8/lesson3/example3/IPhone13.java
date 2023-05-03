package week8.lesson3.example3;

public class IPhone13 extends IPhone12{

    private int price;

    public IPhone13() {
        setPrice(0);
        setColor("White");
        setCameraPixels(0);
        setMemory(0);
    }

    public IPhone13(int memory, double cameraPixels, String color, int price) {
        setPrice(price);
        setColor(color);
        setCameraPixels(cameraPixels);
        setMemory(memory);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
