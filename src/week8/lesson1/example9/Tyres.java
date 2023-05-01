package week8.lesson1.example9;

public class Tyres {

    private String name;
    private String season;
    private int price;

    public Tyres(){
        this.name = "No Name";
        this.season = "No Season";
        this.price = 0;
    }

    public Tyres(String name, String season, int price) {
        this.name = name;
        this.season = season;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
