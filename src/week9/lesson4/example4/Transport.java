package week9.lesson4.example4;

public class Transport implements Cloneable{

    private String name;
    private int price;
    private int speed;

    public Transport(){
        this.name = "No name";
        this.price = 10;
        this.speed = 10;
    }
    public Transport(String name, int price, int speed) {
        this.name = name;
        this.price = price;
        this.speed = speed;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void move(){
        System.out.println(
                "My transport " + getName() +
                " that costs " + getPrice() +
                " USD is moving with speed " + getSpeed() + " km/h");
    }

    @Override
    public String toString(){
        return getName() + " " + getPrice() + " USD, " + getSpeed() + " km/h";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
