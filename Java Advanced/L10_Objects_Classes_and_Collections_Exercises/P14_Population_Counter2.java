package L10_Objects_Classes_and_Collections_Exercises;

import sun.awt.image.ImageWatched;

import java.util.*;
import java.util.stream.Collectors;

public class P14_Population_Counter2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,LinkedHashMap<String,Long>> countries=new LinkedHashMap<>();

        while(true) {
            String[] line=sc.nextLine().split("\\|");
            if("report".equalsIgnoreCase(line[0]))
            {
                break;
            }
            if(!countries.containsKey(line[1]))
            {
                countries.put(line[1],new LinkedHashMap<>());
                countries.get(line[1]).put(line[0],Long.valueOf(0L));
            }
            else
            {
                    countries.get(line[1]).put(line[0], Long.valueOf(line[2]));
            }
            HashMap<String,Long> countriesPopulation=new LinkedHashMap<>();
            LinkedHashMap<String,Long> sortedTowns=new LinkedHashMap<>();
            for(String country:countries.keySet())
            {
                 sortedTowns=
                countries.get(country).entrySet().stream()
                                      .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                                      .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue
                                      ,(a,b)->a,LinkedHashMap::new));

                Long sum=0L;
                for(String s:sortedTowns.keySet())
                {
                  sum+=sortedTowns.get(s);
                }
                countriesPopulation.put(country,sum);
            }
            countriesPopulation.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                    .forEach(b->{
                        System.out.printf("%s (total population: %d\n",b.getKey(),b.getValue());
                      //  countries.entrySet().stream().forEach();
                    });
                 //   .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue
                   //         ,(a,b)->a,LinkedHashMap::new));


        }

    }

}
