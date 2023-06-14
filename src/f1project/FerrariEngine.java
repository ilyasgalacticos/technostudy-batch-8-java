package f1project;

public class FerrariEngine extends Engine {

    public FerrariEngine(double engineVolume, int cylinderAmount, double engineWeight) {
        super(engineVolume, cylinderAmount, engineWeight);
    }

    public FerrariEngine() {
        super();
    }

    @Override
    public double efficiency() {
        return 0.25;
    }

    @Override
    public double throttleEnergy() {
        return getEngineVolume() * getCylinderAmount() * 100;
    }

    @Override
    public double breakEnergy() {
        return getEngineWeight() * 2;
    }
}
