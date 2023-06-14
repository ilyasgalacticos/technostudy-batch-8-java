package f1project;

import f1project.Engine;

public class RenaultEngine extends Engine {

    private double extraTurboEnergy;

    public RenaultEngine(double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy) {
        super(engineVolume, cylinderAmount, engineWeight);
        this.extraTurboEnergy = extraTurboEnergy;
    }

    public RenaultEngine(){

    }

    public double getExtraTurboEnergy() {
        return extraTurboEnergy;
    }

    public void setExtraTurboEnergy(double extraTurboEnergy) {
        this.extraTurboEnergy = extraTurboEnergy;
    }

    @Override
    public double efficiency() {
        return 0.27;
    }

    @Override
    public double throttleEnergy() {
        return getEngineVolume() * getCylinderAmount() * 110 + extraTurboEnergy;
    }

    @Override
    public double breakEnergy() {
        return getEngineWeight() * 2.1;
    }

}
