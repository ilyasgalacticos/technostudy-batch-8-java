package encapsulation;

import java.util.ArrayList;

public class Car {

    private String name;
    private int price;
    private ArrayList<String> details;

    public Car(){
        details = new ArrayList<>();
    }

    public Car(String name, int price) {
        this.details = new ArrayList<>();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void addDetails(String detail){
        this.details.add(detail);
    }

    public void printData(){
        System.out.println(this.name + " - " + this.price + " USD");
        System.out.println("DETAILS ARE : " + this.details);
    }
}
