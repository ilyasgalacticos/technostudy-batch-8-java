package week9.lesson4.example3;

public class Transport {
    private String name;
    private int price;
    private int speed;
    public Transport(){
        this.name = "Some Transport";
        this.speed = 10;
        this.price = 100;
    }
    public Transport(String name){
        this.name = name;
    }

    public Transport(String name, int price, int speed){
        this.name = name;
        this.price = price;
        this.speed = speed;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    private int getSpeed(){
        return this.speed;
    }
    private void setSpeed(int speed){
        this.speed = speed;
    }
    public String getData(){
        return this.name + " " + this.price + " USD, " + this.speed + " km/h";
    }
}
