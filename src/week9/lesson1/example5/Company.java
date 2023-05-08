package week9.lesson1.example5;

public class Company {

    private String name;
    private String city;
    private User[] workers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public User[] getWorkers() {
        return workers;
    }

    public void setWorkers(User[] workers) {
        this.workers = workers;
    }

    public void printWorkers() {
        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i].getUserData());
        }
    }

}
