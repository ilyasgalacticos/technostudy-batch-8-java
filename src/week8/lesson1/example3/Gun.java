package week8.lesson1.example3;

public class Gun {
    private String name;
    private int bullets;
    private int capacity;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public int getCapacity(){
        return this.capacity;
    }
    public void setBullets(int bullets){
        this.bullets = bullets;
    }
    public int getBullets(){
        return this.bullets;
    }

}
