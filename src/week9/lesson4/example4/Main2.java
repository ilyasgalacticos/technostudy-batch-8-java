package week9.lesson4.example4;

public class Main2 {

    public static void main(String[] args) throws CloneNotSupportedException {

        Transport tr1 = new Transport("Motorbike", 2000, 100);
        Transport tr2 = (Transport) tr1.clone();

        tr1.setName("Super Bike");
        tr1.setSpeed(200);
        tr1.setPrice(5555);

        System.out.println(tr1);
        System.out.println(tr2);

    }

}
