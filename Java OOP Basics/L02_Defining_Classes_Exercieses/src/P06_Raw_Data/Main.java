package P06_Raw_Data;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedHashMap<String,Car> map=new LinkedHashMap<>();
        int n=Integer.parseInt(sc.nextLine());

        for (int i=0;i<n;i++)
        {
            String[] input=sc.nextLine().split("\\s+");
            String model=input[0];
            double engineSpeed=Double.parseDouble(input[1]);
            double enginePower=Double.parseDouble(input[2]);
            double cargoWeight=Double.parseDouble(input[3]);
            String cargoType=input[4];

            Engine engine=new Engine(engineSpeed,enginePower);
            Cargo cargo=new Cargo(cargoWeight,cargoType);
            List<Tyres> list=new ArrayList<>();
            for (int j=5;j<=11;j+=2)
            {
                double tyrePressure=Double.parseDouble(input[j]);
                int age=Integer.parseInt(input[j+1]);
                Tyres tyres=new Tyres(tyrePressure,age);
                list.add(tyres);
            }
            Car car=new Car(model,engine,cargo,list);
            map.put(model,car);
        }
        String command=sc.nextLine();
        switch (command)
        {
            case "fragile":
                map.entrySet().stream().filter(x->x.getValue().getCargo().getCargoType().equals("fragile")).filter(y->{
                     int counter=0;
                    for (Tyres tyre:y.getValue().getTyres())
                    {
                        if (tyre.getPressure()<1)
                        {
                            counter++;
                        }
                    }
                    return counter>=1;
                }).forEach(c->{
                    System.out.println(c.getKey());
                });
                break;
            case "flamable":
                map.entrySet().stream().filter(x->x.getValue().getEngine().getEnginePower()>250).forEach(y->{
                    System.out.println(y.getKey());
                });
                break;

        }
    }
}
