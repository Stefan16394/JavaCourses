package P01_Vehicles;

import java.text.DecimalFormat;

public class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;

    public Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
         setFuelConsumption(fuelConsumption);
    }

    public void drive(double distance)
    {   if (this.fuelQuantity>=distance*fuelConsumption)
    {
        this.fuelQuantity-=distance*fuelConsumption;
        DecimalFormat d=new DecimalFormat("#.##");
        String format =d.format(distance);
        System.out.printf("%s travelled %s km\n",this.getClass().getSimpleName(), format);
    }
    else {
        System.out.printf("%s needs refueling\n",this.getClass().getSimpleName());
    }

    }

    public void refuel(double amount)
    {
        this.fuelQuantity+=amount;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString(){
        return String.format("%s: %.2f",this.getClass().getSimpleName(),this.fuelQuantity);
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
