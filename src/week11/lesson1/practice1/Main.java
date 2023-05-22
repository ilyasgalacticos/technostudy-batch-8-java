package week11.lesson1.practice1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        set.add(in.nextInt());
        set.add(in.nextInt());
        set.add(in.nextInt());
        set.add(in.nextInt());
        set.add(in.nextInt());

        int sum = 0;
        for(Integer elem : set){
            sum = sum + elem;
        }
        System.out.println(sum);
    }

}