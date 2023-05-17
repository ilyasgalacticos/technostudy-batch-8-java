package week10.lesson3.example4;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(11);
        nums.add(0);
        nums.add(88);
        nums.add(-5);
        nums.add(7);
        nums.add(9);

        System.out.println(nums);

        List<Integer> sortedList = nums.stream().sorted().toList();
        System.out.println(sortedList);

    }
}
