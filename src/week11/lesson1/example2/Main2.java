package week11.lesson1.example2;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        if(!uniqueNumbers.contains(4)){
            uniqueNumbers.add(4);
        }

        if(!uniqueNumbers.contains(55)){
            uniqueNumbers.add(55);
        }

        if(!uniqueNumbers.contains(4)){
            uniqueNumbers.add(4);
        }

        System.out.println(uniqueNumbers);
    }
}
