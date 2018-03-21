package P07_Car_Salesman;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        LinkedHashMap<String,Engine> engines=new LinkedHashMap<>();
       // LinkedHashMap<String,Car> cars=new LinkedHashMap<>();
        for (int i=0;i<n;i++)
        {
            String[] input=sc.nextLine().split("\\s+");
            String model=input[0];
            int power=Integer.parseInt(input[1]);
            String displacement="n/a";
            String efficiency="n/a";
            if (input.length==3)
            {
                try {
                    int disp=Integer.parseInt(input[2]);
                    displacement=input[2];
                }
                catch (NumberFormatException e)
                {
                    efficiency=input[2];
                }
            }
            else if (input.length==4)
            {
                displacement=input[2];
                efficiency=input[3];
            }
            Engine engine=new Engine(model,power,displacement,efficiency);
            engines.put(model,engine);
        }
        n=Integer.parseInt(sc.nextLine());
        for (int i=0;i<n;i++)
        {
            String[] input=sc.nextLine().split("\\s+");
            String model=input[0];
            String engine=input[1];
            String weight="n/a";
            String color="n/a";
            if (input.length==3)
            {
               try {
                   int wei=Integer.parseInt(input[2]);
                   weight=input[2];
               }
               catch (NumberFormatException e)
               {
                   color=input[2];
               }
            }
            else if (input.length==4)
            {
                weight=input[2];
                color=input[3];
            }
            Car car=new Car(model,engines.get(engine),weight,color);
            // car.put(model,car);

            System.out.println(car.getModel()+":");
            System.out.println("  "+engine+":");
            System.out.println("    Power: "+car.getEngine().getPower());
            System.out.println("    Displacement: "+ car.getEngine().getDisplacement());
            System.out.println("    Efficiency: "+ car.getEngine().getEfficiency());
            System.out.println("  Weight: "+car.getWeight());
            System.out.println("  Color: "+car.getColor());

        }

     /*   for (Map.Entry<String,Car> car:cars.entrySet())
        {
            System.out.println(car.getKey()+":");
            System.out.println("  "+car.getValue().getEngine().getModel()+":");
            System.out.println("    Power: "+car.getValue().getEngine().getPower());
            System.out.println("    Displacement: "+ car.getValue().getEngine().getDisplacement());
            System.out.println("    Efficiency: "+ car.getValue().getEngine().getEfficiency());
            System.out.println("  Weight: "+car.getValue().getWeight());
            System.out.println("  Color: "+car.getValue().getColor());

        }
        */
    }
}
