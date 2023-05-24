package week11.lesson3.example1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        Iterator<Integer> numIterator = numbers.iterator();
        //I created new iterator (pointer), that points to first element of my array list
        while (numIterator.hasNext()) {
            System.out.println(numIterator.next());
        }
        numIterator.remove();

    }
}
