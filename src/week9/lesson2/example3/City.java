package week9.lesson2.example3;

public class City {

    private String name;
    private Restaurant[] restaurants;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Restaurant[] getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Restaurant[] restaurants) {
        this.restaurants = restaurants;
    }

    public void calculateTotalIncome() {
        double totalIncome = 0;
        for (int i = 0; i < restaurants.length; i++) {
            totalIncome = totalIncome + restaurants[i].getTotalIncome();
        }
        System.out.println("Total income is : " + totalIncome + " USD");
    }

    public void calculateTotalOutcome() {
        double totalOutcome = 0;
        for (int i = 0; i < restaurants.length; i++) {
            totalOutcome = totalOutcome + restaurants[i].getTotalOutcome();
        }
        System.out.println("Total outcome is : " + totalOutcome + " USD");
    }

    public void calculateTotalTax() {
        double totalTax = 0;
        for (int i = 0; i < restaurants.length; i++) {
            totalTax = totalTax + restaurants[i].getTax();
        }
        System.out.println("Total tax is : " + totalTax + " USD");
    }
}
