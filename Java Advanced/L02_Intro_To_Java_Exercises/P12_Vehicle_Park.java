package L02_Intro_To_Java_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class P12_Vehicle_Park {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String[] vehicles=sc.nextLine().split(" ");
        int sold=0;

        while(true)
        {
            String[] command=sc.nextLine().split(" ");
            if(command[0].equals("End"))
            {
                break;
            }
            String type= command[0].toLowerCase().substring(0,1);
            int seats=Integer.parseInt(command[2]);
            String lookingFor=(type+seats).toLowerCase();
            Boolean found=false;
           for (int i=0;i<vehicles.length;i++)
           {
               if(vehicles[i].equals(lookingFor))
               {
                   int price=lookingFor.charAt(0)*seats;
                   System.out.printf("Yes, sold for %d$%n",price);
                   vehicles[i]="*";
                   found=true;
                   sold++;
                   break;
               }

            }
            if(!found)
            {
                System.out.println("No");
            }
        }
        List<String> message=new ArrayList<>();
        for(int i=0;i<vehicles.length;i++)
        {
            if(vehicles[i]!="*")
            {
              message.add(vehicles[i]);
            }
        }
        String csv = String.join(", ", message);
        System.out.printf("Vehicles left: %s%n",csv);
        System.out.printf("Vehicles sold: %d%n",sold);
    }
}