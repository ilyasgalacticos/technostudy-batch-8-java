package week11.repeat.example2;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        int a = 10;
        Integer aa = 10;

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println(numbers);
        numbers.remove(1);
        System.out.println(numbers);

        // 2d int array, an array of int arrays
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>());
        matrix.add(new ArrayList<>());
        matrix.add(new ArrayList<>());
        matrix.add(new ArrayList<>());

        matrix.get(0).add(10);
        matrix.get(0).add(20);
        matrix.get(0).add(30);
        matrix.get(0).add(40);

        matrix.get(1).add(99);
        matrix.get(1).add(88);
        matrix.get(1).add(77);
        matrix.get(1).add(66);

        System.out.println(matrix);

    }
}
