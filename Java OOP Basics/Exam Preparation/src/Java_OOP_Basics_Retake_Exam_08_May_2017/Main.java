package Java_OOP_Basics_Retake_Exam_08_May_2017;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedHashMap<String,List<Bender>> benders=new LinkedHashMap<>();
        benders.put("Air",new ArrayList<>());
        benders.put("Fire",new ArrayList<>());
        benders.put("Water",new ArrayList<>());
        benders.put("Earth",new ArrayList<>());

        LinkedHashMap<String,List<Monument>> monuments=new LinkedHashMap<>();
        monuments.put("Air",new ArrayList<>());
        monuments.put("Fire",new ArrayList<>());
        monuments.put("Water",new ArrayList<>());
        monuments.put("Earth",new ArrayList<>());

        StringBuilder wars=new StringBuilder();
        int warCounter=1;
        while (true)
        {
            String[] command=sc.nextLine().split(" ");
            if (command[0].equals("Quit"))
            {
                break;
            }
            switch (command[0])
            {
                case "Bender":
                    String type=command[1];
                    String name=command[2];
                    int power=Integer.parseInt(command[3]);
                    double afinity=Double.parseDouble(command[4]);

                    Bender bender=null;
                    switch (type)
                    {
                        case "Air":
                             bender=new AirBender(name,power,afinity);
                            break;
                        case "Water":
                            bender=new WaterBender(name,power,afinity);
                            break;
                        case "Fire":
                           bender=new FireBender(name,power,afinity);
                            break;
                        case "Earth":
                           bender=new EarthBender(name,power,afinity);
                           break;
                    }
                    benders.get(type).add(bender);
                    break;


                case "Monument":
                     type=command[1];
                     name=command[2];
                     int mAffinity=Integer.parseInt(command[3]);

                     Monument monuments1=null;
                    switch (type)
                    {
                        case "Air":
                            monuments1=new AirMonument(name,mAffinity);
                            break;
                        case "Water":
                            monuments1=new WaterMonument(name,mAffinity);
                            break;
                        case "Fire":
                            monuments1=new FireMonument(name,mAffinity);
                            break;
                        case "Earth":
                            monuments1=new EarthMonument(name,mAffinity);
                            break;
                    }
                    monuments.get(type).add(monuments1);
                    break;

                case "Status":
                    String nation=command[1];
                    System.out.println(nation+" Nation");
                    List<Bender> list=benders.get(nation);
                    if (list.size()==0)
                    {
                        System.out.println("Benders: None");
                    }
                    else
                    {
                        System.out.println("Benders:");
                        for (Bender bender1:list)
                        {   
                            System.out.println(bender1.toString());
                        }
                    }
                    List<Monument>list1=monuments.get(nation);
                    if (list1.size()==0)
                    {
                        System.out.println("Monuments: None");
                    }
                    else
                    {
                        System.out.println("Monuments:");
                        for (Monument monuments2:list1)
                        {
                            System.out.println(monuments2.toString());
                        }
                    }
                    break;
                case "War":
                    nation=command[1];
                    double airPower=calculateNationPower("Air",benders,monuments);
                    double waterPower=calculateNationPower("Water",benders,monuments);
                    double firePower=calculateNationPower("Fire",benders,monuments);
                    double earthPower=calculateNationPower("Earth",benders,monuments);
                    List<Double> powers=new ArrayList<>();
                    powers.add(airPower);
                    powers.add(waterPower);
                    powers.add(firePower);
                    powers.add(earthPower);

                    String war="War "+warCounter+" issued by "+nation;
                    wars.append(war).append("\n");
                    warCounter++;
                    double best=-1;
                    int index=-1;
                   for (int i=0;i<powers.size();i++)
                   {
                       if (powers.get(i)>best)
                       {
                           index=i;
                           best=powers.get(i);
                       }
                   }
                   switch (index)
                   {
                       case 0:
                           benders.put("Water",new ArrayList<>());
                           benders.put("Fire",new ArrayList<>());
                           benders.put("Earth",new ArrayList<>());

                           monuments.put("Water",new ArrayList<>());
                           monuments.put("Fire",new ArrayList<>());
                           monuments.put("Earth",new ArrayList<>());
                         break;

                       case 1:
                           benders.put("Air",new ArrayList<>());
                           benders.put("Fire",new ArrayList<>());
                           benders.put("Earth",new ArrayList<>());

                           monuments.put("Air",new ArrayList<>());
                           monuments.put("Fire",new ArrayList<>());
                           monuments.put("Earth",new ArrayList<>());
                           break;

                       case 2:
                           benders.put("Air",new ArrayList<>());
                           benders.put("Water",new ArrayList<>());
                           benders.put("Earth",new ArrayList<>());

                           monuments.put("Water",new ArrayList<>());
                           monuments.put("Air",new ArrayList<>());
                           monuments.put("Earth",new ArrayList<>());
                           break;

                       case 3:
                           benders.put("Water",new ArrayList<>());
                           benders.put("Fire",new ArrayList<>());
                           benders.put("Air",new ArrayList<>());

                           monuments.put("Water",new ArrayList<>());
                           monuments.put("Fire",new ArrayList<>());
                           monuments.put("Air",new ArrayList<>());
                           break;

                   }
                 break;


            }
        }
        System.out.println(wars.toString());


    }
    private static double calculateNationPower(String nation,LinkedHashMap<String,List<Bender>> benders,LinkedHashMap<String,List<Monument>> monuments)
    {
       double power=benders.get(nation).stream().mapToDouble(x->x.calculatePower()).sum();
        power=power+power*monuments.get(nation).stream().mapToInt(x->x.afinity()).sum()/100;
        return power;
    }
}
