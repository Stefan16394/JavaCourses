package Paw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true)
        {
            String[] command=sc.nextLine().split(" \\| ");
            if (command[0].equals("Paw Paw Pawah"))
            {
                break;
            }


            switch (command[0])
            {
                case "RegisterCleansingCenter":
                    AnimalCenterManager.registerCleansingCenter(command[1]);
                    break;

                case "RegisterAdoptionCenter":
                    AnimalCenterManager.registerAdoptionCenter(command[1]);
                    break;

                case "RegisterCastrationCenter":
                    AnimalCenterManager.registerCastrationCenter(command[1]);
                    break;

                case "RegisterDog":
                    AnimalCenterManager.registerDog(command[1],Integer.valueOf(command[2]),Integer.valueOf(command[3]),
                            command[4]);
                    break;

                case "RegisterCat":
                    AnimalCenterManager.registerCat(command[1],Integer.valueOf(command[2]),Integer.valueOf(command[3]),
                            command[4]);
                    break;

                case "SendForCleansing":
                    AnimalCenterManager.sendForCleansing(command[1],command[2]);
                    break;

                case "SendForCastration":
                    AnimalCenterManager.sendForCastration(command[1],command[2]);
                    break;

                case "Cleanse":
                    AnimalCenterManager.cleanse(command[1]);
                    break;

                case "Castrate":
                    AnimalCenterManager.castrate(command[1]);
                    break;

                case "Adopt":
                    AnimalCenterManager.adopt(command[1]);
                    break;

                case "CastrationStatistics":
                    AnimalCenterManager.castrationStatistics();
                    break;

            }
        }
        AnimalCenterManager.printStatistics();
    }
}
