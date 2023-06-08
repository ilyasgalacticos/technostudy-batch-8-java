package repeat.set;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
        numbers.add(99);
        numbers.add(20);
        numbers.add(77);
        System.out.println(numbers);

        for(Integer e : numbers){
            System.out.println(e);
        }

        numbers.remove(99);

        System.out.println(numbers);

        System.out.println(numbers.contains(10));
        System.out.println(numbers.contains(800));

    }
}
