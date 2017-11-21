package P01_Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] car=sc.nextLine().split("\\s+");
        Car car1=new Car(Double.parseDouble(car[1]),Double.parseDouble(car[2]));
        String[] truck=sc.nextLine().split("\\s+");
        Truck truck1=new Truck(Double.parseDouble(truck[1]),Double.parseDouble(truck[2]));
        int n=Integer.parseInt(sc.nextLine());
        for (int i=0;i<n;i++)
        {
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
                   break;
               case "Refuel":
                   if (command[1].equals("Car"))
                   {
                       car1.refuel(Double.parseDouble(command[2]));
                   }
                   else if ((command[1].equals("Truck")))
                   {
                       truck1.refuel(Double.parseDouble(command[2]));
                   }
                break;
           }

        }
        System.out.println(car1.toString());
        System.out.println(truck1.toString());
    }
}
