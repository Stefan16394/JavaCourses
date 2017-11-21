package P05_Speed_Racing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedHashMap<String,Car> map=new LinkedHashMap<>();
        int n=Integer.parseInt(sc.nextLine());
        for (int i=0;i<n;i++)
        {
         String[] input=sc.nextLine().split("\\s+");
         String carModel=input[0];
         double fuelAmount=Double.parseDouble(input[1]);
         double perKm=Double.parseDouble(input[2]);
         Car car=new Car(carModel,fuelAmount,perKm);
         map.put(carModel,car);
        }
        while (true)
        {
            String[] drive=sc.nextLine().split("\\s+");
            if (drive[0].equals("End"))
            {
                break;
            }
            String driveModel=drive[1];
            double kmToDrive=Double.parseDouble(drive[2]);
            if (map.get(driveModel).getFuel()>=kmToDrive*map.get(driveModel).getFuelPerKM())
            {
             map.get(driveModel).drive(kmToDrive);
            }
            else
            {
                System.out.println("Insufficient fuel for the drive");
            }
        }
        for (Map.Entry<String, Car> car:map.entrySet())
        {
            System.out.printf("%s %.2f %.0f\n",car.getKey(),car.getValue().getFuel(),car.getValue().getDistanceTraveled());
        }
    }
}
