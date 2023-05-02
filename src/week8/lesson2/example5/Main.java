package week8.lesson2.example5;

public class Main {

    public static void main(String[] args) {
        Pizza peperoni = new Pizza();
        peperoni.setName("Peperoni");
        peperoni.setCalories(3000);
        peperoni.setDiameter(30);

        Pizza margarita = new Pizza();
        margarita.setName("Margarita");
        margarita.setCalories(2000);
        margarita.setDiameter(25);

        Soup tomato = new Soup();
        tomato.setName("Tomato Soup");
        tomato.setVolume(500);
        tomato.setCalories(1200);

        Soup chicken = new Soup();
        chicken.setName("Chicken Soup");
        chicken.setCalories(1000);
        chicken.setVolume(400);

        Food[] foods = {peperoni, margarita, tomato, chicken};
        for (int i = 0; i < foods.length; i++) {
            foods[i].eat();
        }
    }
}
