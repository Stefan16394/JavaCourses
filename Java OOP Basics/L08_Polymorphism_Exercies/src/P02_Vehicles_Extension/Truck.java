package P02_Vehicles_Extension;

public class Truck extends Vehicle {

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }


    @Override
    public void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption+1.6);
    }


    @Override
    public void refuel(double amount) {
        super.refuel(amount*0.95);
    }

}
