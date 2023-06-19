package shopping;

public class ElectronicProduct extends Product implements Discountable {

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

    @Override
    public double calculateDiscountPrice(int amount) {
        if(amount >= 3){
            return amount * getPrice() * 0.3;
        }else if(amount == 2){
            return amount * getPrice() * 0.2;
        }else{
            return amount * getPrice();
        }
    }

    @Override
    public String getData() {
        return getName() + " costs "
                + getPrice() + " USD, with voltage "
                + getVoltage() + " Volts, with battery life "
                + getBatteryLife() + " minutes, that uses plug type "
                + getPlugType().getType();
    }
}
