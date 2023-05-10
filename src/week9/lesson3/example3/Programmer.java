package week9.lesson3.example3;

public class Programmer implements User{

    private String nick;
    private String level;
    private int salary;

    public Programmer(String nick, String level, int salary) {
        this.nick = nick;
        this.level = level;
        this.salary = salary;
    }

    public Programmer(){
        this.nick = "java";
        this.level = "junior";
        this.salary = 0;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String getData() {
        return getLevel() + " developer " + getNick() + " earns " + getSalary() + " USD";
    }

    @Override
    public void work() {
        System.out.println(getData() + " is coding!");
    }
}
