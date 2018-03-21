package P01_Vehicles;

public class Truck extends Vehicle {

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    public void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption+1.6);
    }

    @Override
    public void drive(double distance) {
        super.drive(distance);
    }

    @Override
    public void refuel(double amount) {
        super.refuel(amount*0.95);
    }

}
