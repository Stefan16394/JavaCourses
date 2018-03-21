package P02_Vehicles_Extension;

import java.text.DecimalFormat;

public class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
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
    {    if (amount>0)
       {
           if (amount>tankCapacity)
           {
               throw new IllegalArgumentException("Cannot fit fuel in tank");
           }
           this.fuelQuantity+=amount;
       }
       else
       {
        throw new IllegalArgumentException("Fuel must be a positive number");
       }

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

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }
}
