package week12.lesson4.example2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 60; i++) {
            for (int j = 0; j < 60; j++) {
                String min = String.valueOf(i);
                String sec = String.valueOf(j);
                if (i < 10) {
                    min = "0" + min;
                }
                if (j < 10) {
                    sec = "0" + sec;
                }
                try{
                    Thread.sleep(500);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println(min + " : " + sec);
                }catch (Exception e){
                }
            }
        }
    }

}
