package week11.lesson1.example5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(10);
        ages.add(20);
        ages.add(30);
        ages.add(9999);

        Set<Integer> nums = new HashSet<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        System.out.println("First set is : " + nums);

        Set<Integer> otherNums = new HashSet<>();
        otherNums.add(77);
        otherNums.add(88);
        otherNums.add(20);
        otherNums.add(30);
        otherNums.add(40);

        System.out.println("Second set is : " + otherNums);

        nums.addAll(otherNums);
        nums.addAll(ages);

        System.out.println("Final merged set is " + nums);

    }
}
