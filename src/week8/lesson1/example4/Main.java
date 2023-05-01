package week8.lesson1.example4;

public class Main {
    public static void main(String[] args) {

        Food f1 = new Food();
        f1.setName("Burger");
        f1.setCalories(1000);
        f1.setWeight(0.2);
        f1.setPrice(5);

        Food f2 = new Food();
        f2.setName("Doner");
        f2.setCalories(2000);
        f2.setWeight(0.3);
        f2.setPrice(7);

        Food f3 = new Food();
        f3.setName("Pasta");
        f3.setCalories(2500);
        f3.setWeight(0.4);
        f3.setPrice(12);

        Food[] foods = {f1, f2, f3};
        for(int i = 0; i < foods.length; i++){
            System.out.println(foods[i].getName());
        }

    }
}
