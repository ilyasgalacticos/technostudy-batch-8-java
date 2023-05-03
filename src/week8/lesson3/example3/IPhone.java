package week8.lesson3.example3;

public class IPhone {
    private int memory;
    private double cameraPixels;

    public IPhone(){
        this.memory = 0;
        this.cameraPixels = 0;
    }

    public IPhone(int memory, double cameraPixels) {
        this.memory = memory;
        this.cameraPixels = cameraPixels;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getCameraPixels() {
        return cameraPixels;
    }

    public void setCameraPixels(double cameraPixels) {
        this.cameraPixels = cameraPixels;
    }
}
