package week9.lesson1.example2;

public class Toyota extends Car{

    private int engineCylinders;
    private int power;

    public int getEngineCylinders() {
        return engineCylinders;
    }

    public void setEngineCylinders(int engineCylinders) {
        this.engineCylinders = engineCylinders;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public int getSpeed() {
        return power * engineCylinders;
    }
}
