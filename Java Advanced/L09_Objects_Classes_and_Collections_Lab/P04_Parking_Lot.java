package L09_Objects_Classes_and_Collections_Lab;

import java.util.HashSet;
import java.util.Scanner;

public class P04_Parking_Lot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<String> cars=new HashSet<>();
        while (true)
        {
            String[] commands=sc.nextLine().split(", ");
            String command=commands[0];
            if(command.equals("END"))
            {
                break;
            }
            String carNumber=commands[1];
            switch (command)
            {
                case "IN":cars.add(carNumber);break;
                case "OUT":
                    if(!cars.isEmpty())
                    {
                        cars.remove(carNumber);break;

                    }
            }
        }
        if(cars.isEmpty())
        {
            System.out.println("Parking Lot is Empty");
            return;
        }

        for (String element:cars) {
            System.out.println(element);
        }
    }
}
