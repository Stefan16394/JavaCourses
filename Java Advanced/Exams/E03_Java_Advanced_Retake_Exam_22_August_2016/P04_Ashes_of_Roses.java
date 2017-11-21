package E03_Java_Advanced_Retake_Exam_22_August_2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P04_Ashes_of_Roses {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String,Long> regions=new LinkedHashMap<>();
        LinkedHashMap<String,LinkedHashMap<String,Long>>flowers=new LinkedHashMap<>();
        Pattern regionPattern=Pattern.compile("^[A-Z][a-z]*$");
        Pattern colorPattern=Pattern.compile("^[A-Za-z0-9]+$");
        Pattern quantityPattern=Pattern.compile("^[0-9]*$");
        while (true)
        {
            String[] input=sc.readLine().split(" ");
            if(input[0].equals("Icarus,"))
            {
                break;
            }
            String region=input[1].replace("<","").replace(">","");
            String color=input[2].replace("<","").replace(">","");
            String quantity=input[3];
            Matcher regionMatch=regionPattern.matcher(region);
            Matcher colorMatch=colorPattern.matcher(color);
            Matcher quantityMatch=quantityPattern.matcher(quantity);
            if(regionMatch.find() && colorMatch.find()&&quantityMatch.find())
            {
                if(!flowers.containsKey(region))
                {
                    LinkedHashMap<String,Long> map=new LinkedHashMap<>();
                    map.put(color,Long.parseLong(quantity));
                    flowers.put(region,map);
                }
                else
                {
                    if(flowers.get(region).containsKey(color))
                    {
                     flowers.get(region).put(color,flowers.get(region).get(color)+Long.parseLong(quantity));
                    }
                    else
                    {   LinkedHashMap<String,Long> map=flowers.get(region);
                        map.put(color,Long.parseLong(quantity));
                        flowers.put(region,map);
                    }
                }
                if(!regions.containsKey(region))
                {
                    regions.put(region,Long.parseLong(quantity));
                }
                else
                {
                    regions.put(region,regions.get(region)+Long.parseLong(quantity));
                }
            }
           regions= regions.entrySet().stream().sorted((a,b)->{
               int result=b.getValue().compareTo(a.getValue());
               if(result!=0)
               {
                   return b.getValue().compareTo(a.getValue());
               }
               else
               {
                   return a.getKey().compareTo(b.getKey());
               }
            }).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue
                    ,(a,b)->a,LinkedHashMap::new));

        }

        regions.forEach((key, value) -> {
            System.out.println(key);
            flowers.entrySet().stream().filter(x->x.getKey().equals(key)).
                    forEach(y->y.getValue().entrySet().stream().sorted((a,b)->{
                        int result=a.getValue().compareTo(b.getValue());
                        if(result!=0)
                        {
                            return a.getValue().compareTo(b.getValue());
                        }
                        return a.getKey().compareTo(b.getKey());
        }).forEach(c->{
                        System.out.printf("*--%s | %d\n",c.getKey(),c.getValue());
        }));
});
}
}