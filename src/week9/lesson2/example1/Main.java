package week9.lesson2.example1;

public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger();
        Food food = new Food(){
            @Override
            public double getCalories() {
                return 200;
            }
        };
    }
}
