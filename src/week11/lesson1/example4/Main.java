package week11.lesson1.example4;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer> nums = new HashSet<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        System.out.println(nums);

        nums.clear();

        System.out.println(nums);

    }
}
