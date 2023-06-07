package coffeemachine;

public class Coffee {
    private CoffeeSize size;
    private CoffeeType type;
    private boolean cold;
    private boolean withMilk;
    private boolean withSugar;

    public Coffee() {
    }

    public Coffee(CoffeeType type, boolean cold) {
        this.type = type;
        this.cold = cold;
    }

    public boolean isCold() {
        return cold;
    }

    public void setCold(boolean cold) {
        this.cold = cold;
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
