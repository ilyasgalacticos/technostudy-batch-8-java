package week8.lesson3.example2;

public class A {
    private int x;
    private String y;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public String getY() {
        return y;
    }
    public void setY(String y) {
        this.y = y;
    }

    public void toPrintData(){
        System.out.println(this.x + " - " + this.y);
    }
}
