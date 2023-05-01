package week8.lesson1.example7;

public class MathOperations {

    private static final double pi = 3.14159265359;

    public static double calculateArea(double radius) {
        return pi * radius * radius;
    }

    public static double calculateVolume(double radius) {
        return 4 / 3 * pi * radius * radius * radius;
    }

    public static double calculatePerimeter(double radius) {
        return 2 * pi * radius;
    }

}
