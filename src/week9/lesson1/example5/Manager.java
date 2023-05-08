package week9.lesson1.example5;

public class Manager extends User {

    private String fullName;
    private int stage;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    @Override
    public String getUserData() {
        return "Manager " + getFullName() + " with stage " + getStage() + " years";
    }
}
