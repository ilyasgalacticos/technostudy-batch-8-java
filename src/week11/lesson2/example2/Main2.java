package week11.lesson2.example2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main2 {

    public static void main(String[] args) {

        Map<Character, Integer> alphabet = new HashMap<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabet.put(ch, 0);
        }

        Scanner in = new Scanner(System.in);
        String name = in.next().toLowerCase(); // hakan

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i); // letter - h
            alphabet.put(ch, alphabet.get(ch) + 1);
        }

        for(Character letter : alphabet.keySet()){
            if(alphabet.get(letter) > 0){
                System.out.println(letter + " - " + alphabet.get(letter));
            }
        }

    }

}
