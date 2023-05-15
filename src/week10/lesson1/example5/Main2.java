package week10.lesson1.example5;

public class Main2 {
    public static void main(String[] args) {
        Car[] cars = new Car[10];
        //{null, null, null, null, null, null, null, null, null, null}
        cars[1] = new Car("Toyota", 210);
        cars[2] = new Car("Mazda", 200);
        cars[3] = new Car("Porsche", 320);
        cars[4] = new Car("Tesla", 210);
        cars[5] = new Car("Mercedes", 220);
        cars[6] = new Car("BMW", 240);
        cars[7] = new Car("Jeep", 180);
        cars[8] = new Car("Honda", 280);
        cars[9] = new Car("Renault", 200);

        for (int i = 0; i < cars.length; i++) {
            try {
                cars[i].ride();
            }catch (NullPointerException e){
                System.out.println("Car at position " + i + " is null");
            }
        }
    }
}
