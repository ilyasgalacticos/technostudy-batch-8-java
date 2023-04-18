package week6.lesson2;

import java.util.Scanner;

public class Example01Methods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        toGetMax(100, 200, 4);
        toGetMax(1000, 400, 46576);
        toGetMax(-1, -2, -4);
        toGetMax(34, 22, 11);
    }

    public static void toGetMax(int x, int y, int z) {
        if (x > y && x > z) {
            System.out.println(x);
        } else if (y > x && y > z) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }
    }
}
