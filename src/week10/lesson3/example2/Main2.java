package week10.lesson3.example2;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        //immutable classes:
        Integer a = 10; // int a = 10;
        a++; // 11
        Double b = 3.4;
        Float f = 5.6F;
        Boolean bool = true;
        Character ch = 'A';
        Byte bt = 45;
        Long lng = 56L;
        Short sh = 44;

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        int sum = 0;
        for (Integer x : numbers) {
            sum = sum + x;
        }
        // for(int i = 0; i < numbers.size(); i++){
        //     sum = sum + numbers.get(i);
        // }
        System.out.println(sum);

        int arr[] = {1, 2, 3, 4, 5};
        int total = 0;
        for(int elem : arr){
            total = total + elem;
        }
        System.out.println(total);
    }
}
