package week8.lesson4.example3;

public class Shape {

    private String name;
    private int perimeter;
    private int area;

    public Shape() {
        this.name = "No Shape";
        this.perimeter = 0;
        this.area = 0;
    }

    public Shape(String name, int perimeter, int area) {
        this.name = name;
        this.perimeter = perimeter;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void draw(){
        System.out.println("I am drawing new Shape " + getName());
        System.out.println("Area : " + getArea() + ", Perimeter: " + getPerimeter());
    }

}
