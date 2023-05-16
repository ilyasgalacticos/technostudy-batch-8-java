package week10.lesson2.example5;

public class SuperDangerousException extends RuntimeException {

    private String name;
    private int speed;

    public SuperDangerousException(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public String getMessage() {
        return "Your " + this.name + " car's speed is " + this.speed + " km/h that is not allowed!";
    }
}
