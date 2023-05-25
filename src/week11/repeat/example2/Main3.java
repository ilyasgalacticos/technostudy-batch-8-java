package week11.repeat.example2;

import java.util.HashSet;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        System.out.println(set.add(10));
        System.out.println(set.add(20));
        System.out.println(set.add(30));
        System.out.println(set.add(40));
        System.out.println(set.add(10));

        System.out.println(set);

        for(Integer elem : set){
            System.out.println(elem);
        }

        if(set.contains(66)){
            System.out.println("Element 66 is in set");
        }else{
            System.out.println("There is no 66 in set");
        }
    }
}
