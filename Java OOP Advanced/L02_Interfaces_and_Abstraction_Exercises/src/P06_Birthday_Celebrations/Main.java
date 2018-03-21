package P06_Birthday_Celebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Pet> pets=new ArrayList<>();
        List<Citizen> citizens=new ArrayList<>();
        while (true)
        {
            String[] input=sc.nextLine().split("\\s+");
            if (input[0].equals("End"))
            {
                break;
            }
            switch (input[0])
            {
                case "Citizen":
                    Citizen citizen=new Citizen(input[1],Integer.valueOf(input[2]),input[3],input[4]);
                    citizens.add(citizen);
                    break;

                case "Pet":
                    Pet pet=new Pet(input[1],input[2]);
                    pets.add(pet);
                    break;

                case "Robot":
                    Robot robot=new Robot(input[1],input[2]);
                    break;
            }
        }
        String fakeId=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for (Citizen citizen:citizens)
        {
           sb.append(citizen.getId(fakeId));
        }
        for (Pet pet:pets)
        {
            sb.append(pet.getId(fakeId));
        }
        System.out.print(sb.toString());
    }
}
