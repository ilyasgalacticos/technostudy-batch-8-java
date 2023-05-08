package week9.lesson1.example2;

public class Tesla extends Car{

    private int voltage;
    private int currency;

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public int getCurrency() {
        return currency;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }

    @Override
    public int getSpeed() {
        return voltage * currency;
    }
}
