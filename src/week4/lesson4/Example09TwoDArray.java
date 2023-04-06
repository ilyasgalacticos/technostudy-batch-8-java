package week4.lesson4;

import java.util.Scanner;

public class Example09TwoDArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[][] users = {
                {"Ilyas", "Zhuanyshev", "33", "10000$"},
                {"Bahar", "Deniz", "18", "20000$"},
                {"John", "Smith", "22", "15000$"},
                {"Ozgur", "Gogersin", "30", "25000$"},
                {"Ilyas", "Benzema", "35", "12325000$"},
        };

        System.out.println("Insert name: ");
        String searchName = in.next();

        for (int i = 0; i < users.length; i++) {
            if(users[i][0].equals(searchName)){
                System.out.println(searchName + " earns " + users[i][3] + " per month");
            }
        }
    }
}
