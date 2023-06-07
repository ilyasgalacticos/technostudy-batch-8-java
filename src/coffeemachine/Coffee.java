package coffeemachine;

public class Coffee {
    private String name;
    private boolean cold;
    private int price;
    private CoffeeSize size;
    private CoffeeType type;

    public Coffee() {
    }

    public Coffee(String name, boolean cold, int price, CoffeeSize size, CoffeeType type) {
        this.name = name;
        this.cold = cold;
        this.price = price;
        this.size = size;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCold() {
        return cold;
    }

    public void setCold(boolean cold) {
        this.cold = cold;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CoffeeSize getSize() {
        return size;
    }

    public void setSize(CoffeeSize size) {
        this.size = size;
    }

    public CoffeeType getType() {
        return type;
    }

    public void setType(CoffeeType type) {
        this.type = type;
    }
}
