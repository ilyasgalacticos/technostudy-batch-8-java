package week7.lesson2.example2;

public class Car {
    String name; // type of property (not primitive)
    int speed;
    double price; // fields can carry/hold/keep data


    // methods will work/act with this fields
    public void ride(){
        System.out.println("I am a car " + name
                + " riding with speed " + speed + " km/h");
    }
}
