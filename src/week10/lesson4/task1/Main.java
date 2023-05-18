package week10.lesson4.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Player> players = new ArrayList<>();

        players.add(new Player("Ilyas Zhuanyshev", 50000, 34));

        Player messi = new Player("Leo Messi", 50000000, 35);
        Player ronaldo = new Player("Cristiano Ronaldo", 20000000, 38);

        players.add(messi);
        players.add(ronaldo);

        players.add(new Player("Kyliyan Mbappe", 200000000, 24));
        players.add(new Player("Erling Haaland", 250000000, 22));
        players.add(new Player("Hakan Calhanoglu", 60000000, 28));
        players.add(new Player("Karim Benzema", 50000000, 35));
        players.add(new Player("Luka Modric", 30000000, 37));
        players.add(new Player("Sabri Sarioglu", 2000000, 35));
        players.add(new Player("Vinicius Junior", 180000000, 22));

        float totalPrice = 0;
        int sum = 0;

        for (Player p : players){
            totalPrice = totalPrice + p.getPrice();
            sum = sum + p.getAge();
        }

        System.out.println("Average price is : " + totalPrice/players.size());
        System.out.println("Sum of ages of players is : " + sum);
    }
}
