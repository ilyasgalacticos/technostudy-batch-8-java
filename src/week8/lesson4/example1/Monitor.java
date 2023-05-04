package week8.lesson4.example1;

public class Monitor {
    String name;
    int width;
    int height;
    String resolution;

    public void turnOn(){
        System.out.println(
                "Monitor " + this.name + ", "
                        + this.height + " cm - " + this.width
                        + " cm, " + this.resolution
                        + " is turning on");
    }
}
