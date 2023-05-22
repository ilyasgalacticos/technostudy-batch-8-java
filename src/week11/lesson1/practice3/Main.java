package week11.lesson1.practice3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> elements = new HashSet<>();
        Scanner in = new Scanner(System.in);

        while (true) {
            int elem = in.nextInt();
            if (elem == 0) {
                break;
            }
            elements.add(elem);
        }

        if(elements.contains(77)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
