package P08_Military_Elite;

import P08_Military_Elite.Interfaces.*;
import P08_Military_Elite.Privates.LeutenantGeneral;
import P08_Military_Elite.Privates.Private;
import P08_Military_Elite.Privates.SpecialisedSoldiers.Commando;
import P08_Military_Elite.Privates.SpecialisedSoldiers.Engineer;
import P08_Military_Elite.Privates.SpecialisedSoldiers.Missions;
import P08_Military_Elite.Privates.SpecialisedSoldiers.Repairs;
import P08_Military_Elite.Spies.Spy;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedHashMap<String,Private> soldiers=new LinkedHashMap<>();
        while (true)
        {
            String[] input=sc.nextLine().split("\\s+");
            if (input[0].equals("End"))
            {
                break;
            }
            switch (input[0]){
                case "Private":
                    Private iPrivate=new Private(input[1],input[2],input[3],Double.valueOf(input[4]));
                    soldiers.put(input[1],iPrivate);
                    System.out.println(iPrivate.toString());
                    break;

                case "LeutenantGeneral":
                    ILeutenantGeneral leutenantGeneral=new LeutenantGeneral(input[1],input[2],input[3], Double.valueOf(input[4]));
                    for (int i=5;i<input.length;i++)
                    {
                         String id=input[i];
                         leutenantGeneral.getPrivates().add(soldiers.get(id));
                    }
                    System.out.print(leutenantGeneral.toString());
                    break;

                case "Engineer":
                   try {
                       IEngineer engineer=new Engineer(input[1],input[2],input[3],Double.valueOf(input[4]),input[5]);
                       for (int i=6;i<input.length;i+=2)
                       {
                           Repairs repairs=new Repairs(input[i],Integer.valueOf(input[i+1]));
                           engineer.getRepairs().add(repairs);
                       }
                       System.out.print(engineer.toString());
                   }
                   catch (IllegalArgumentException ignored)
                   {

                   }
                   break;

                case "Commando":
                   try {
                       ICommando commando=new Commando(input[1],input[2],input[3],Double.valueOf(input[4]),input[5]);
                       for (int i=6;i<input.length;i+=2)
                       {
                           try {
                               Missions mission=new Missions(input[i],input[i+1]);
                               commando.getMissions().add(mission);
                           }
                           catch (IllegalArgumentException e) {
                           }

                       }
                       System.out.print(commando.toString());
                   }
                   catch (IllegalArgumentException ignored) {
                   }

                    break;

                case "Spy":
                    ISpy spy=new Spy(input[1],input[2],input[3],Integer.valueOf(input[4]));
                    System.out.println(spy.toString());
                    break;
            }
        }
    }
}
