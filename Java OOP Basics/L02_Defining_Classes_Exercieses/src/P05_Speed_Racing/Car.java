package P05_Speed_Racing;

public class Car {
    private String model;
    private double fuel;
    private double fuelPerKM;
    private double distanceTraveled=0;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getFuelPerKM() {
        return fuelPerKM;
    }

    public void setFuelPerKM(double fuelPerKM) {
        this.fuelPerKM = fuelPerKM;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public Car(String model, double fuel, double fuelPerKM) {
        this.model = model;
        this.fuel = fuel;
        this.fuelPerKM = fuelPerKM;
    }

    public void drive(double km)
    {
        this.fuel-=km*fuelPerKM;
        this.distanceTraveled+=km;
    }
}
