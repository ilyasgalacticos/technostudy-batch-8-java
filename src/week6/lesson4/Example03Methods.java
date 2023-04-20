package week6.lesson4;

import java.util.Scanner;

//create a method that will draw n x m rectangle via stars inserted text
// Example :
/*
    n = 5, m = 4, text = "#"

    # # # #
    # # # #
    # # # #
    # # # #
    # # # #

    n = 3, m = 7, text = "&"

    & & & & & & &
    & & & & & & &
    & & & & & & &

*/
public class Example03Methods {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        String text = in.nextLine();

        rectangle(n, m, text);
    }

    public static void rectangle(int n, int m, String text) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(text + " ");
            }
            System.out.println();
        }
    }
}