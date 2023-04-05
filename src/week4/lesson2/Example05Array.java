package week4.lesson2;

import java.util.Scanner;

public class Example05Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String[] names = new String[n]; // String array

        for (int i = 0; i < names.length; i++) {
            names[i] = in.next();
        }

        String max = names[0];
        for (int i = 1; i < names.length; i++) {
            if(names[i].length() > max.length()){
                max = names[i];
            }
        }
        System.out.println(max);
    }
}
