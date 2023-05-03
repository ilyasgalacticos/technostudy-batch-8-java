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
        System.out.println(
                "Laptop ASUS "
                        + getName() + ", "
                        + getRam() + " GB RAM, "
                        + getVideoCardMemory() + " GB Video Card, "
                        + getSsd() + " GB MEMORY SSD is turning ON"
        );
    }

    @Override
    public void turnOff(){
        System.out.println(
                "Laptop ASUS "
                        + getName() + ", "
                        + getRam() + " GB RAM, "
                        + getVideoCardMemory() + " GB Video Card, "
                        + getSsd() + " GB MEMORY SSD is turning OFF"
        );
    }
}
