package week7.lesson4.example3;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Car mercedes = new Car("Mercedes", "E280", 220, 40);
        Car mercedes2 = new Car("Mercedes", "E280", 220, 40);
        System.out.println(mercedes);
        System.out.println(mercedes2);
        Car x = (Car) mercedes.clone();
        mercedes.name = "Ilyas";
        mercedes.strings.add("jyffgh");

        Car g = null;
        System.out.println(g.name);

        System.out.println(x);
        System.out.println(mercedes);

        System.out.println(x.name);
    }
}
