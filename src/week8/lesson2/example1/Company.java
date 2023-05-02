package week8.lesson2.example1;

public class Company {
    private String name;
    private int rentCost; // Cost for rent of office
    private Worker ceo; // Owner, chief executive officer
    private Worker financeDirector; // responsible for finance
    private Worker[] stuff;

    public Company(String name, int rentCost, Worker ceo, Worker financeDirector, Worker[] stuff) {
        this.name = name;
        this.rentCost = rentCost;
        this.ceo = ceo;
        this.financeDirector = financeDirector;
        this.stuff = stuff;
    }

    public Company() {
        this.name = "No Company";
        this.rentCost = 0;
        this.ceo = new Worker();
        this.financeDirector = new Worker();
        this.stuff = new Worker[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRentCost() {
        return rentCost;
    }

    public void setRentCost(int rentCost) {
        this.rentCost = rentCost;
    }

    public Worker getCeo() {
        return ceo;
    }

    public void setCeo(Worker ceo) {
        this.ceo = ceo;
    }

    public Worker getFinanceDirector() {
        return financeDirector;
    }

    public void setFinanceDirector(Worker financeDirector) {
        this.financeDirector = financeDirector;
    }

    public Worker[] getStuff() {
        return stuff;
    }

    public void setStuff(Worker[] stuff) {
        this.stuff = stuff;
    }

    public void printData() {
        System.out.println("Company: " + this.name);
        System.out.println("Rent Cost: " + this.rentCost + " USD");
        System.out.println("CEO: " + this.ceo.getData());
        System.out.println("Finance Director: " + this.financeDirector.getData());
        System.out.println("Workers stuff: ");
        for (int i = 0; i < this.stuff.length; i++) {
            System.out.println(this.stuff[i].getData());
        }
    }
}
