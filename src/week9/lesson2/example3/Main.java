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

        MCDonalds mc1 = new MCDonalds();
        mc1.setBurgers(80000);
        mc1.setDrinks(100000);
        mc1.setIceCreams(50000);
        mc1.setWorkers(10);

        Restaurant[] restaurants = {kfc1, kfc2, mc1};
        istanbul.setRestaurants(restaurants);

        istanbul.calculateTotalIncome();
        istanbul.calculateTotalOutcome();
        istanbul.calculateTotalTax();

    }
}
