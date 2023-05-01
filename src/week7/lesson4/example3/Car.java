package week7.lesson4.example3;

import java.util.ArrayList;

public class Car implements Cloneable{

    final ArrayList<String> strings = new ArrayList<>();
    String name;
    String model;
    double speed;
    double fuel;

    public Car(){
        this.name = "Default Car";
        this.model = "Default model";
        this.speed = 0;
        this.fuel = 0;
    }
    public Car(String name, String model, double speed, double fuel){
        this.name = name;
        this.model = model;
        this.speed = speed;
        this.fuel = fuel;
    }

    public void ride(double km){
        if(this.fuel - km / speed * 20 > 0) {
            System.out.println("I am riding for "+km +" km");
            this.fuel = this.fuel - km / speed * 20;
        }else{
            System.out.println("Your tank will be empty");
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
