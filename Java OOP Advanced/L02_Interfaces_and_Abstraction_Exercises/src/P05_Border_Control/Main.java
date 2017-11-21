package P05_Border_Control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<IDGetter> personas=new ArrayList<>();

        while (true)
        {
            String[] input=sc.nextLine().split("\\s+");
            if (input[0].equals("End"))
            {
                break;
            }
            if (input.length==2)
            {
                IDGetter robot=new Robot(input[0],input[1].trim());
                personas.add(robot);
            }
            else if (input.length==3)
            {
                IDGetter citizen=new Citizen(input[0],Integer.valueOf(input[1]),input[2].trim());
                personas.add(citizen);
            }
        }
        String fakeId=sc.nextLine();

        for (IDGetter citizen:personas)
        {
          if (citizen.getId().endsWith(fakeId))
          {
              System.out.println(citizen.getId());
          }
        }


    }
}
