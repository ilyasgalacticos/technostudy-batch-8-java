package week8.lesson1.example2;

public class Human {
    private String fullName;
    private int age;
    private int height;
    private double weight;

    public String getFullName(){
        return this.fullName;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getHeight(){
        return this.height;
    }

    public void setHeight(int height){
        this.height = height;
    }
    public double getWeight(){
        return this.weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getData(){
        return this.fullName + " "
                + this.height + " cm, "
                + this.weight + " kg, "
                + this.age + " year old";
    }
}
