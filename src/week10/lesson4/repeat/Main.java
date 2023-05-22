package week10.lesson4.repeat;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // [10, 20, 30]
        numbers.remove(0);
        // [20, 30]
        numbers.remove(0);
        // [30]
        int num = numbers.remove(0);
        System.out.println(num);

        System.out.println(numbers);

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>());
        matrix.add(new ArrayList<>());
        matrix.add(new ArrayList<>());

        matrix.get(0).add(10);
        matrix.get(0).add(20);
        matrix.get(0).add(30);
        matrix.get(0).add(40);
        matrix.get(1).add(66);
        matrix.get(1).add(77);
        matrix.get(1).add(88);
        matrix.get(1).add(99);
        matrix.get(2).add(66);
        matrix.get(2).add(55);
        matrix.get(2).add(77);
        matrix.get(2).add(44);


        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}
