package P02_Vehicles_Extension;

import java.text.DecimalFormat;

public class Bus extends Vehicle {
    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    public void drive(double distance,boolean isEmpty) {
        if (isEmpty)
        {
            super.drive(distance);
        }
        else
        {
            if (this.getFuelQuantity()>=distance*(this.getFuelConsumption()+1.4))
            {
                this.setFuelQuantity(this.getFuelQuantity()-distance*(this.getFuelConsumption()+1.4));
                DecimalFormat d=new DecimalFormat("#.##");
                String format =d.format(distance);
                System.out.printf("%s travelled %s km\n",this.getClass().getSimpleName(), format);
            }
            else {
                System.out.printf("%s needs refueling\n",this.getClass().getSimpleName());
            }
        }
    }
}
