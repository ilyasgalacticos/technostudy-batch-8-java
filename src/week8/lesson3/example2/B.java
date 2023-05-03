package week8.lesson3.example2;

public class B extends A {
    private double z;

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    // Method overriding, overwrite
    public void toPrintData(){
        System.out.println(getX() + " - " + getY() + " - " + getZ());
    }
}
