package P08_Pet_Clinics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Controller c=new Controller();
        int n=Integer.valueOf(sc.nextLine());
        for (int i=0;i<n;i++)
        {   String[] input=sc.nextLine().split("\\s+");
            switch (input[0])
            {
                case "Create":
                    switch (input[1]){
                        case "Pet":
                            Pet pet=new Pet(input[2],Integer.valueOf(input[3]),input[4]);
                            c.getPets().put(input[2],pet);
                            break;
                        case "Clinic":
                           try {
                               Clinic clinic=new Clinic(input[2],Integer.valueOf(input[3]));
                               c.getClinics().put(input[2],clinic);
                           }
                           catch (IllegalArgumentException e)
                           {
                               System.out.println(e.getMessage());
                           }

                            break;
                    }
                    break;
                case "Add":

                        System.out.println(c.add(input[1], input[2]));

                    break;
                case "Release":
                    System.out.println(c.release(input[1]));
                    break;
                case "HasEmptyRooms":
                    System.out.println(c.hasEmptyRooms(input[1]));
                    break;
                case "Print":
                    if (input.length==2)
                    {
                        c.print(input[1]);
                    }
                    else
                    {
                        c.printRoom(input[1],Integer.valueOf(input[2]));
                    }
                    break;

            }
        }

    }
}
