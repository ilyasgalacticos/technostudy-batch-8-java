package week7.lesson1;


import javax.swing.plaf.PanelUI;

public class Example02MethodOverload {
    public static void main(String[] args) {

        System.out.println(getSum(4.0, 5));
        System.out.println(getSum(5f, 5));
        System.out.println(getSum(6, 5.0));
        System.out.println(getSum(4, 5));
    }

    public static double getSum(double a, double b) {
        System.out.println("I am using double method");
        return a + b;
    }

    public static int getSum(int a, int b) {
        System.out.println("I am using int method");
        return a + b;
    }

    public static long getSum(long a, long b) {
        System.out.println("I am using long method");
        return a + b;
    }

    public static float getSum(float a, float b) {
        System.out.println("I am using float method");
        return a + b;
    }

    public static String getSum(char a, char b) {
        return a + "" + b;
    }
}