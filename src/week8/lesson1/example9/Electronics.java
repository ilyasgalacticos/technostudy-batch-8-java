package week8.lesson1.example9;

public class Electronics {

    private String name;
    private int price;

    public Electronics(){
        this.name = "Default Electronics";
        this.price = 0;
    }

    public Electronics(String name, int price) {
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
}
