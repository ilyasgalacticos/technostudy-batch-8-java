package week10.lesson2.example4;

public class Car {

    private String name;
    private int speed;

    public Car(){

    }

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void ride() throws DangerousException {
        if(this.speed >= 250){
            throw new DangerousException();
        }else{
            System.out.println(
                    "I am car " + this.name
                            + " riding with speed "
                            + this.speed + " km/h");
        }
    }

}
