package week12.lesson2.example3;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<News> newsList = new ArrayList<>();

        while (true) {
            System.out.println("PRESS 1 TO ADD NEWS");
            System.out.println("PRESS 2 TO LIST NEWS");
            System.out.println("PRESS 0 TO EXIT");
            String choice = in.next();

            if(choice.equals("1")){

                System.out.println("Insert title: ");
                String title = in.next();
                System.out.println("Insert content: ");
                String content = in.next();

                News news = new News();
                news.setTitle(title);
                news.setContent(content);
                news.setAddedTime(new Date());

                newsList.add(news);

            }else if(choice.equals("2")){

                for(News news : newsList){
                    System.out.println(news);
                }

            }else if(choice.equals("0")){
                break;
            }else{
                System.out.println("Incorrect command");
            }
        }

    }

}
