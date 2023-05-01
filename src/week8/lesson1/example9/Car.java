package week8.lesson1.example9;

public class Car {

    private String name;
    private String model;
    private Engine engine;
    private Tyres leftFrontTyre;
    private Tyres leftBackTyre;
    private Tyres rightFrontTyre;
    private Tyres rightBackTyre;
    private Electronics electronics;
    private int price;

    public Car() {
        this.name = "No Name";
        this.model = "No Model";
        this.engine = new Engine();
        this.leftFrontTyre = new Tyres();
        this.leftBackTyre = new Tyres();
        this.rightFrontTyre = new Tyres();
        this.rightBackTyre = new Tyres();
        this.electronics = new Electronics();
        this.price = 0;
    }

    public Car(String name, String model, Engine engine, Tyres leftFrontTyre, Tyres leftBackTyre, Tyres rightFrontTyre, Tyres rightBackTyre, Electronics electronics, int price) {
        this.name = name;
        this.model = model;
        this.engine = engine;
        this.leftFrontTyre = leftFrontTyre;
        this.leftBackTyre = leftBackTyre;
        this.rightFrontTyre = rightFrontTyre;
        this.rightBackTyre = rightBackTyre;
        this.electronics = electronics;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tyres getLeftFrontTyre() {
        return leftFrontTyre;
    }

    public void setLeftFrontTyre(Tyres leftFrontTyre) {
        this.leftFrontTyre = leftFrontTyre;
    }

    public Tyres getLeftBackTyre() {
        return leftBackTyre;
    }

    public void setLeftBackTyre(Tyres leftBackTyre) {
        this.leftBackTyre = leftBackTyre;
    }

    public Tyres getRightFrontTyre() {
        return rightFrontTyre;
    }

    public void setRightFrontTyre(Tyres rightFrontTyre) {
        this.rightFrontTyre = rightFrontTyre;
    }

    public Tyres getRightBackTyre() {
        return rightBackTyre;
    }

    public void setRightBackTyre(Tyres rightBackTyre) {
        this.rightBackTyre = rightBackTyre;
    }

    public Electronics getElectronics() {
        return electronics;
    }

    public void setElectronics(Electronics electronics) {
        this.electronics = electronics;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
