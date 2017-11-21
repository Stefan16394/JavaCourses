package L10_Objects_Classes_and_Collections_Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class P15_Legendary_Farming {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> materials=new TreeMap<>();
        materials.put("shards",0);
        materials.put("fragments",0);
        materials.put("motes",0);
        Map<String,Integer> junk=new TreeMap<>();
        boolean obtained=false;
        while(!obtained)
        {
            String[] input=sc.nextLine().split(" ");
            for(int i=0;i<input.length;i=i+2)
            {
                    int quantity=Integer.parseInt(input[i]);
                    String name=input[i+1].toLowerCase();
                    if(materials.containsKey(name)) {
                        materials.put(name,materials.get(name)+quantity);
                        if(materials.get(name)>=250)
                        {
                            switch (name){
                                case "shards":
                                    obtained=true;
                                    materials.put(name,materials.get(name)-250);
                                    System.out.println("Shadowmourne obtained!");break;
                                case "fragments":
                                    obtained=true;
                                    materials.put(name,materials.get(name)-250);
                                    System.out.println("Valanyr obtained!");break;
                                case "motes":
                                    obtained=true;
                                    materials.put(name,materials.get(name)-250);
                                    System.out.println("Dragonwrath obtained!");break;
                            }
                        }
                    }
                    else
                    {
                       if(junk.containsKey(name))
                       {
                           junk.put(name,junk.get(name)+quantity);
                       }
                       else
                       {
                           junk.put(name,quantity);
                       }
                    }
                if(obtained)
                {
                    break;
                }
            }

        }
        materials=materials.entrySet().stream().sorted((a,b)->{
            Integer value1=a.getValue();
            Integer value2=b.getValue();
            return value2.compareTo(value1);
        }).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldValue, newValue)->newValue, LinkedHashMap::new));
        for (Map.Entry<String, Integer> material:materials.entrySet())
        {
            System.out.printf("%s: %d\n",material.getKey(),material.getValue());
        }
        for (Map.Entry<String, Integer> thrash:junk.entrySet()) {
            System.out.printf("%s: %d\n",thrash.getKey(),thrash.getValue());

        }


    }
}
