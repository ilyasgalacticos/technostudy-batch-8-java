package week8.lesson3.example4;

public class Laptop {

    private String name;
    private int ram;
    private int ssd;

    public Laptop(){
        setName("No Name");
        setRam(0);
        setSsd(0);
    }

    public Laptop(String name, int ram, int ssd){
        setName(name);
        setRam(ram);
        setSsd(ssd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public void turnOn(){
        System.out.println(
                "Laptop "
                        + getName() + ", "
                        + getRam() + " GB RAM, "
                        + getSsd() + " GB MEMORY SSD is turning ON"
        );
    }

    public void turnOff(){
        System.out.println(
                "Laptop "
                        + getName() + ", "
                        + getRam() + " GB RAM, "
                        + getSsd() + " GB MEMORY SSD is turning OFF"
        );
    }
}
