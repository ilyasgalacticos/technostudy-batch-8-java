package encapsulation;

public class Main {
    public static void main(String[] args) {

        Car toyota = new Car("Toyota Camry 70", 25000);
        toyota.addDetails("Motor");
        toyota.addDetails("Mirror");

        toyota.printData();

    }
}
