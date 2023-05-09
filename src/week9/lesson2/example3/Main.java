package week9.lesson2.example3;

public class Main {
    public static void main(String[] args) {

        City istanbul = new City();
        istanbul.setName("Istanbul");

        KFC kfc1 = new KFC();
        kfc1.setWorkers(10);
        kfc1.setChickenLegs(100000);
        kfc1.setChickenWings(200000);

        KFC kfc2 = new KFC();
        kfc2.setWorkers(4);
        kfc2.setChickenWings(50000);
        kfc2.setChickenLegs(100000);

        Restaurant[] restaurants = {kfc1, kfc2};
        istanbul.setRestaurants(restaurants);

        istanbul.calculateTotalIncome();
        istanbul.calculateTotalOutcome();
        istanbul.calculateTotalTax();

    }
}
