package week10.lesson3.example4;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        System.out.println(matrix);
        matrix.add(new ArrayList<>());
        matrix.add(new ArrayList<>());
        matrix.add(new ArrayList<>());
        System.out.println(matrix);

        matrix.get(0).add(11); //matrix[0][0] = 11;
        System.out.println(matrix);

        matrix.get(0).add(22);
        System.out.println(matrix);

        matrix.get(1).add(77);
        matrix.get(2).add(88);
        matrix.get(2).add(99);
        matrix.get(2).add(66);
        System.out.println(matrix);

    }
}
