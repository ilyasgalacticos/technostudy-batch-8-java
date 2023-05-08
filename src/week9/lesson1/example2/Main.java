package week9.lesson1.example2;

public class Main {
    public static void main(String[] args) {

        Toyota toyota = new Toyota();
        toyota.setPower(40);
        toyota.setEngineCylinders(6);

        Tesla tesla = new Tesla();
        tesla.setCurrency(2);
        tesla.setVoltage(110);

        System.out.println(toyota.getDistance(2));
        System.out.println(tesla.getDistance(2));

    }
}
