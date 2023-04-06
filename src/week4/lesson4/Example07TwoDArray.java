package week4.lesson4;

import java.util.Scanner;

public class Example07TwoDArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[][] users = {
                {"Ilyas", "Zhuanyshev", "33", "10000$"},
                {"Bahar", "Deniz", "18", "20000$"},
                {"John", "Smith", "22", "15000$"},
                {"Ozgur", "Gogersin", "30", "25000$"}
        };

        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users[i].length; j++) {
                System.out.print(users[i][j] + " ");
            }
            System.out.println();
        }

    }
}
