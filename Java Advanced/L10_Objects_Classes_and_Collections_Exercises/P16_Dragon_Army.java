package L10_Objects_Classes_and_Collections_Exercises;

import sun.reflect.generics.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P16_Dragon_Army {
    private static int DEFAULTDAMAGE=45;
    private static int DEFAULTHEALTH=250;
    private static int DEFAULTARMOR=10;

    public static void main(String[] args) throws IOException {
          BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
          int n=Integer.parseInt(reader.readLine());
           LinkedHashMap<String,TreeMap<String,int[]>> dragons=new LinkedHashMap<>();
           for (int i=0;i<n;i++)
           {
               String[] line=reader.readLine().split("\\s+");
               String type=line[0];
               String dragonName=line[1];
               Integer damage=line[2].equals("null")? DEFAULTDAMAGE:Integer.parseInt(line[2]);
               Integer health=line[3].equals("null")? DEFAULTHEALTH:Integer.parseInt(line[3]);
               Integer armor=line[4].equals("null")? DEFAULTARMOR:Integer.parseInt(line[4]);

               if(!dragons.containsKey(type))
               {
                   dragons.put(type,new TreeMap<String, int[]>());
               }

               dragons.get(type).put(dragonName,new int[]{damage,health,armor});

           }
           for(Map.Entry<String, TreeMap<String, int[]>> allDragons:dragons.entrySet())
           {
              calculateAndPrintAverage(allDragons.getValue(),allDragons.getKey());
               System.out.println();
              for (Map.Entry<String, int[]> currentDragon:allDragons.getValue().entrySet()){
                  System.out.printf("-%s -> damage: %d, health: %d, armor: %d\n",currentDragon.getKey(),
                          currentDragon.getValue()[0],currentDragon.getValue()[1],currentDragon.getValue()[2]);
              }
           }





    /*            Scanner sc=new Scanner(System.in);
                int n=Integer.parseInt(sc.nextLine());
                LinkedHashMap<String,List<Dragon>> dracons=new LinkedHashMap<>();
                for(int i=0;i<n;i++)
                {
                    String[] dragon=sc.nextLine().split(" ");
                    String color=dragon[0];
                    String name=dragon[1];
                    int damage=0;
                    int health=0;
                    int armor=0;
                    try {
                        damage = Integer.parseInt(dragon[2]);
                    }
                    catch (NumberFormatException e)
                    {
                        damage=45;
                    }
                    try {
                        health = Integer.parseInt(dragon[3]);
                    }
                    catch (NumberFormatException e)
                    {
                        health=250;
                    }
                    try {
                        armor = Integer.parseInt(dragon[4]);
                    }
                    catch (NumberFormatException e)
                    {
                        armor=10;
                    }

                    Dragon dragon1=new Dragon();
                    dragon1.type=color;
                    dragon1.name=name;
                    dragon1.damage=damage;
                    dragon1.health=health;
                    dragon1.armor=armor;

                    if(!dracons.containsKey(color))
                    {   List<Dragon> list=new ArrayList<>();
                        list.add(dragon1);
                        dracons.put(color,list);
                    }
                    else{
                        boolean found=false;
                        for (Dragon x:dracons.get(color)) {
                            if(x.name.equals(name))
                            {
                                x.name=name;
                                x.armor=armor;
                                x.health=health;
                                x.damage=damage;
                                x.type=color;
                                found=true;
                                break;
                            }
                        }
                        if(!found)
                        {
                            List<Dragon> list2=dracons.get(color);
                            list2.add(dragon1);
                            dracons.put(color,list2);
                        }
                    }

                }
                for(Map.Entry<String, List<Dragon>> x:dracons.entrySet())
                {
                    System.out.println(x.getKey());
                    for (Dragon dragon:x.getValue())
                    {
                        System.out.printf("-%s -> damage: %d, health: %d, armor: %d",dragon.name,dragon.damage,dragon.health,dragon.armor);
                        System.out.println();
                    }
                }
            }
            static class Dragon{
                String type;
                String name;
                int damage;
                int health;
                int armor;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getDamage() {
                    return damage;
                }

                public void setDamage(int damage) {
                    this.damage = damage;
                }

                public int getHealth() {
                    return health;
                }

                public void setHealth(int health) {
                    this.health = health;
                }

                public int getArmor() {
                    return armor;
                }

                public void setArmor(int armor) {
                    this.armor = armor;
                }
            }
        }
*/
    }

    private static void calculateAndPrintAverage(TreeMap<String, int[]> value,String color) {
     Double averageDamage=0.00;
     Double averageHealth=0.00;
     Double averageArmor=0.00;

        for (int[] s:value.values()){
            averageDamage+=s[0];
            averageHealth+=s[1];
            averageArmor+=s[2];
        }
        averageDamage/=value.size();
        averageHealth/=value.size();
        averageArmor/=value.size();

        System.out.printf("%s::(%.2f/%.2f/%.2f)",color,averageDamage,averageHealth,averageArmor);
    }
}