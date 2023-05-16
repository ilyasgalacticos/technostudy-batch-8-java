package week10.lesson2.example4;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Mercedes");
        car.setSpeed(300);

        try {
            car.ride();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
