package week9.lesson3.example3;

public class Teacher implements User{

    private String fullName;
    private String degree;
    private int stage;

    public Teacher(String fullName, String degree, int stage) {
        this.fullName = fullName;
        this.degree = degree;
        this.stage = stage;
    }

    public Teacher() {
        this.fullName = "Mkyong Java";
        this.stage = 0;
        this.degree = "Bachelor";
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    @Override
    public String getData() {
        return getFullName() + " with " + getDegree() + " degree has stage " + getStage() + " years";
    }

    @Override
    public void work() {
        System.out.println(getData() + " is teaching!");
    }
}
