package week11.lesson1.practice2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Set<Integer> nums = new HashSet<>();

        while (true) {
            int num = in.nextInt();
            if (num == 0) {
                break;
            }
            nums.add(num);
        }
        int sum = 0;
        for(Integer elem : nums){
            sum = sum + elem;
        }
        System.out.println(sum);
    }
}