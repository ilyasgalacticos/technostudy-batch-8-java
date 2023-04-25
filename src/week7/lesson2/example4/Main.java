package week7.lesson2.example4;

public class Main {
    public static void main(String[] args) {
        Food f1 = new Food();
        f1.name = "Burger";
        f1.calories = 700;
        f1.vegetarian = false;
        f1.price = 5;
        f1.weight = 0.4;

        Food f2 = new Food();
        f2.name = "Greek salad";
        f2.calories = 200;
        f2.price = 7;
        f2.weight = 0.2;
        f2.vegetarian = true;

        Food f3 = new Food();
        f3.name = "Maklube";
        f3.weight = 4;
        f3.price = 50;
        f3.calories = 20000;
        f3.vegetarian = false;

        Food foods[] = {f1, f2, f3};

        for(int i = 0; i < foods.length; i++){
            System.out.println(foods[i].getFoodData());
        }

        foods[0].name = "Burger King";
        foods[0].calories = 900;
        foods[0].price = 7;

        for(int i = 0; i < foods.length; i++){
            System.out.println(foods[i].getFoodData());
        }
    }
}
