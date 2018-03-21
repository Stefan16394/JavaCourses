package P02_Vehicles_Extension;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] car=sc.nextLine().split("\\s+");
        Car car1=new Car(Double.parseDouble(car[1]),Double.parseDouble(car[2]), Double.parseDouble(car[3]));
        String[] truck=sc.nextLine().split("\\s+");
        Truck truck1=new Truck(Double.parseDouble(truck[1]),Double.parseDouble(truck[2]),Double.parseDouble(truck[3]));
        String[] bus=sc.nextLine().split("\\s+");
        Bus bus1=new Bus(Double.parseDouble(bus[1]),Double.parseDouble(bus[2]), Double.parseDouble(bus[3]));
        int n=Integer.parseInt(sc.nextLine());

        for (int i=0;i<n;i++)
        {   boolean isEmpty=false;
            String[] command=sc.nextLine().split(" ");
           switch (command[0]){
               case "Drive":
                   if (command[1].equals("Car"))
                   {
                       car1.drive(Double.parseDouble(command[2]));
                   }
                   else if ((command[1].equals("Truck")))
                   {
                   truck1.drive(Double.parseDouble(command[2]));
                   }
                   else if (command[1].equals("Bus"))
                   {
                       bus1.drive(Double.parseDouble(command[2]),isEmpty);
                   }
                   break;
               case "Refuel":
                   if (command[1].equals("Car"))
                   {
                      try {
                          car1.refuel(Double.parseDouble(command[2]));
                      }
                      catch (IllegalArgumentException e)
                      {
                          System.out.println(e.getMessage());
                      }
                   }
                   else if ((command[1].equals("Truck")))
                   {
                       try {
                           truck1.refuel(Double.parseDouble(command[2]));
                       }
                       catch (IllegalArgumentException e)
                       {
                           System.out.println(e.getMessage());
                       }                   }
                   else if (command[1].equals("Bus"))
                   {
                       try {
                           bus1.refuel(Double.parseDouble(command[2]));
                       }
                       catch (IllegalArgumentException e)
                       {
                           System.out.println(e.getMessage());
                       }
                   }
                break;
               case "DriveEmpty":
                   isEmpty=true;
                   if (command[1].equals("Bus"))
                   {
                       bus1.drive(Double.parseDouble(command[2]),isEmpty);
                   }

           }

        }
        System.out.println(car1.toString());
        System.out.println(truck1.toString());
        System.out.println(bus1.toString());
    }
}
