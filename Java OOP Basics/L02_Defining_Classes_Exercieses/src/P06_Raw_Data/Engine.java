package P06_Raw_Data;

public class Engine {

    private double engineSpeed;
    private double enginePower;

    public double getEngineSpeed() {
        return engineSpeed;
    }

    public void setEngineSpeed(double engineSpeed) {
        this.engineSpeed = engineSpeed;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public Engine(double engineSpeed, double enginePower) {
        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;
    }
}
