package week8.lesson2.example5;

public class Soup extends Food {

    private double volume;

    public Soup() {
        this.volume = 0;
        setName("No Soup Name");
        setCalories(0);
    }

    public Soup(String name, double calories, double volume){
        setCalories(calories);
        setName(name);
        setVolume(volume);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getData(){
        return getName() + " "
                + getVolume() + " ml, "
                + getCalories() + " kcal";
    }

    public void eat(){
        System.out.println("I am drinking "
                + getName() + " " + getVolume() + " ml, with "
                + getCalories() + " kcal");
    }
}
