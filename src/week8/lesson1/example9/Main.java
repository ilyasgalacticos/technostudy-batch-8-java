package week8.lesson1.example9;

public class Main {
    public static void main(String[] args) {

        Tyres michelinTyre = new Tyres("Michelin", "summer", 150);
        Tyres bridgestoneTyre = new Tyres("Bridgestone", "summer", 120);

        Engine ferrariEngine = new Engine("Ferrari F150", 3.5, 10000);

        Electronics sony = new Electronics("Sony", 5000);

        Car myCar = new Car();
        myCar.setName("Ferrari");
        myCar.setModel("F1000");
        myCar.setElectronics(sony);
        myCar.setLeftBackTyre(michelinTyre);
        myCar.setRightBackTyre(michelinTyre);
        myCar.setLeftFrontTyre(bridgestoneTyre);
        myCar.setRightFrontTyre(bridgestoneTyre);
        myCar.setEngine(ferrariEngine);
        myCar.setPrice(80000);

        // 80000 + 150 + 150 + 120 + 120 + 10000 + 5000 = 95540

        int price = myCar.getPrice()
                + myCar.getLeftBackTyre().getPrice()
                + myCar.getRightFrontTyre().getPrice()
                + myCar.getLeftFrontTyre().getPrice()
                + myCar.getRightBackTyre().getPrice()
                + myCar.getEngine().getPrice()
                + myCar.getElectronics().getPrice();

        System.out.println(price);

    }
}
