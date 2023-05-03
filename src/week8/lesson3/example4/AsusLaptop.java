package week8.lesson3.example4;

public class AsusLaptop extends Laptop{

    private double videoCardMemory;

    public AsusLaptop(){
        super();
        setVideoCardMemory(0);
    }

    public AsusLaptop(String name, int ram, int ssd, double videoCardMemory){
        super(name, ram, ssd);
        setVideoCardMemory(videoCardMemory);
    }

    public double getVideoCardMemory() {
        return videoCardMemory;
    }

    public void setVideoCardMemory(double videoCardMemory) {
        this.videoCardMemory = videoCardMemory;
    }

    @Override
    public void turnOn(){

    }

}
