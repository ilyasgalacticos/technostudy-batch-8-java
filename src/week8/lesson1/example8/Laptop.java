package week8.lesson1.example8;

public class Laptop {

    private String name;
    private String model;
    private int price;
    private double ram;
    private SSDDisk ssdDisk;

    public Laptop() {
        this.name = "No Name";
        this.model = "No Model";
        this.price = 0;
        this.ram = 0;
        this.ssdDisk = new SSDDisk();
    }

    public Laptop(String name, String model, int price, double ram, SSDDisk ssdDisk) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.ram = ram;
        this.ssdDisk = ssdDisk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public SSDDisk getSsdDisk() {
        return ssdDisk;
    }

    public void setSsdDisk(SSDDisk ssdDisk) {
        this.ssdDisk = ssdDisk;
    }

    public void executeLaptop() {
        System.out.println(this.name + " " + this.model);
        System.out.println("RAM : " + this.ram + " GB");
        System.out.println("Price : " + this.price + " USD");
        System.out.println("SSD DISK : " + this.ssdDisk.getData());
    }
}
