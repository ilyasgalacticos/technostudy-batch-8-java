package week8.lesson3.example4;

public class MacBookLaptop extends Laptop{

    private String ios;

    public MacBookLaptop() {
        super();
        setIos("11.v");
    }

    public MacBookLaptop(String name, int ram, int ssd, String ios) {
        super(name, ram, ssd);
        setIos(ios);
    }

    public String getIos() {
        return ios;
    }

    public void setIos(String ios) {
        this.ios = ios;
    }

    @Override
    public void turnOn(){
        System.out.println(
                "Macbook "
                        + getName() + ", "
                        + getRam() + " GB RAM, "
                        + getIos() + " iOS Version, "
                        + getSsd() + " GB MEMORY SSD is turning ON"
        );
    }

    @Override
    public void turnOff(){
        System.out.println(
                "Macbook "
                        + getName() + ", "
                        + getRam() + " GB RAM, "
                        + getIos() + " iOS Version, "
                        + getSsd() + " GB MEMORY SSD is turning OFF"
        );
    }

}
