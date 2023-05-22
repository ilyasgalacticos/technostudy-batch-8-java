package week11.lesson1.example5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main3 {

    public static void main(String[] args) {

        Set<Integer> nums1 = new HashSet<>();
        nums1.add(10);
        nums1.add(20);
        nums1.add(30);
        nums1.add(40);

        Set<Integer> nums2 = new HashSet<>();
        nums2.add(20);
        nums2.add(40);
        nums2.add(50);
        nums2.add(60);
        nums2.add(70);

        nums1.retainAll(nums2);
        System.out.println(nums1);

    }

}
