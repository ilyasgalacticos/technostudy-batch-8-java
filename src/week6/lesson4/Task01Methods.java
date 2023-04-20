package week6.lesson4;

import java.util.Scanner;

/*
    Write a method that takes three natural numbers a, b, c as arguments. Determine if there is a triangle with such sides.
    If the triangle exists, print the string YES, otherwise print the string NO.

    Input
    4
    6
    9

    Output
    YES

    Input
    3
    6
    2
    Output
    NO

*/
public class Task01Methods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(checkTriangle(a, b, c));
    }
    public static String checkTriangle(int x, int y, int z){
        if(x + y > z && x + z > y && y + z > x){
            return "YES";
        }else {
            return "NO";
        }
    }
}