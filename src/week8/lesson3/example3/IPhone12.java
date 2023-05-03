package week8.lesson3.example3;

public class IPhone12 extends IPhone{

    private String color;

    public IPhone12() {
        setCameraPixels(0);
        setMemory(0);
        setColor("White");
    }

    public IPhone12(int memory, double cameraPixels, String color) {
        setColor(color);
        setMemory(memory);
        setCameraPixels(cameraPixels);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
