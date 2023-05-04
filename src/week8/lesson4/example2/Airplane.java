package week8.lesson4.example2;

public class Airplane {

    private String name;
    private int passengers;
    private int maxSpeed;

    public Airplane(){
        this.name = "NO AIRPLANE";
        this.passengers = 10;
        this.maxSpeed = 200;
    }

    public Airplane(String name, int passengers, int maxSpeed){
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.passengers = passengers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void fly(){
        System.out.println(
                "Airplane " + getName() + " " + getMaxSpeed() + " km/h, "
                + getPassengers() + " passengers is flying"
        );
    }

}
