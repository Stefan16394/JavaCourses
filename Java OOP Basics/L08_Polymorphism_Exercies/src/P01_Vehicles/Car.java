package P01_Vehicles;


public class Car extends Vehicle{
    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    public void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption+0.9);
    }

    @Override
    public void drive(double distance) {
        super.drive(distance);
    }

    @Override
    public void refuel(double amount) {
        super.refuel(amount);
    }

}
