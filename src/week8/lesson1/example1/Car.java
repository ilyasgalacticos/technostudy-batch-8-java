package week8.lesson1.example1;

public class Car {
    private String name;
    private int maxSpeed;
    private double engineVolume;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setEngineVolume(double engineVolume){
        this.engineVolume = engineVolume;
    }

    public double getEngineVolume(){
        return this.engineVolume;
    }

    public void printData(){
        System.out.println(this.name + " " + this.maxSpeed + " " + this.engineVolume);
    }

}
