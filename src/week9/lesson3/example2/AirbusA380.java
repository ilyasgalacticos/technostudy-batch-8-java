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
        System.out.println("Airbus A380 is flying about " + getMaxDistance() + " km");
    }

    @Override
    public void land() {
        System.out.println("Airbus A380 just landed with " + getPassengers() + " passengers");
    }

    @Override
    public void start() {
        System.out.println("I am starting engine of Airbus A380");
    }

    @Override
    public void turnLeft() {
        System.out.println("Airbus A380 is turning left");
    }

    @Override
    public void turnRight() {
        System.out.println("Airbus A380 is turning right");
    }
}
