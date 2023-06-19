package shopping;

public abstract class ElectronicProduct extends Product {

    private int voltage;
    private int batteryLife;

    private PlugType plugType;

    public ElectronicProduct() {
        super();
    }

    public ElectronicProduct(String name, int price, Category category, int voltage, int batteryLife, PlugType plugType) {
        super(name, price, category);
        this.voltage = voltage;
        this.batteryLife = batteryLife;
        this.plugType = plugType;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public PlugType getPlugType() {
        return plugType;
    }

    public void setPlugType(PlugType plugType) {
        this.plugType = plugType;
    }
}
