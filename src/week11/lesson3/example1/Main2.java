package week11.lesson3.example1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(50);
        nums.add(60);
        nums.add(0);
        nums.add(21);
        nums.add(0);
        nums.add(39);
        nums.add(40);
        nums.add(13);
        nums.add(0);
        nums.add(136);
        nums.add(0);

        System.out.println(nums);

        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            int currentNum = iterator.next();
            if (currentNum == 40 || currentNum == 0) {
                iterator.remove();
            }
        }
        System.out.println(nums);
    }
}
