package week9.lesson1.example2;

public abstract class Car {

    public abstract int getSpeed();

    public int getDistance(int hours){
        return hours * getSpeed();
    }

}
