package week13.oop.repeat.example1;

public class Laptop {
    private String name;
    public int price;
    protected double screenDimension;

    public Laptop(){
        this.name = "No name";
        this.price = 0;
        this.screenDimension = 0;
    }

    public Laptop(String name, int price, double screenDimension){
        this.name = name;
        this.price = price;
        this.screenDimension = screenDimension;
    }

    public void printData(){
        System.out.println("Laptop : "
                + this.name + " "
                + this.price
                + " USD, with dimensions " + this.screenDimension);
    }

    public void printName(){
        int a = 10;
        int b = 20;
        System.out.println("Hello " + (a+b));
        return;
    }

    public int getSum(int a, int b){
        int result = a + b;
        System.out.println("Result is " + result);
        return result;
    }

}
