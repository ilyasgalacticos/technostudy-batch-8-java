package week9.lesson3.example2;

public class AirbusA380 implements Aircraft{

    private int passengers;
    private double maxDistance;

    public AirbusA380(){
        this.passengers = 300;
        this.maxDistance = 12000;
    }

    public AirbusA380(int passengers, double maxDistance){
        this.passengers = passengers;
        this.maxDistance = maxDistance;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public double getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(double maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {

    }

    @Override
    public void land() {

    }

    @Override
    public void start() {

    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }
}
