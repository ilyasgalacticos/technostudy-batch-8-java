package week9.lesson4.example3;

public class Main {

    public static void main(String[] args) {

        Transport transport = new Transport();  // I am calling default constructor
        // creating new instance (object) of class Transport
        // transport.name = "Jeep";
        // transport.setName("Jeep");
        System.out.println(transport.getData());

        Transport tr1 = new Transport();
        tr1.setName("Jeep");
        tr1.setPrice(20000);
        tr1.setSpeed(220);

        String[] pass = {"Ilyas", "Ozgur", "Cankut"};

        Transport tr2 = new Transport("Jeep", 20000, 220, pass);

    }

}
