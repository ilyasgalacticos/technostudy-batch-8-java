package week10.lesson2.example5;

public class SuperCar {

    private String carName;
    private int carSpeed;

    public SuperCar() {
    }

    public SuperCar(String carName, int carSpeed) {
        this.carName = carName;
        this.carSpeed = carSpeed;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(int carSpeed) {
        this.carSpeed = carSpeed;
    }

    public void ride(){
        if(this.carSpeed >= 300){
            throw new SuperDangerousException(this.carName, this.carSpeed);
        }else{
            System.out.println("I am car "
                    + this.carName
                    + " riding with speed "
                    + this.carSpeed + " km/h");
        }
    }
}
