package L10_Objects_Classes_and_Collections_Exercises;

import java.util.*;
import java.util.stream.Collectors;

public class P14_Population_Counter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,Long> countries=new LinkedHashMap<>();
        Map<String,Map<String,Long>> cities=new LinkedHashMap<>();
        while (true)
        {
            String[] input=sc.nextLine().split("\\|");
            if(input[0].equals("report"))
            {
                break;
            }
            String city=input[0];
            String country=input[1];
            Long population=Long.parseLong(input[2]);

            //add to countries
            if(countries.containsKey(country))
            {
                countries.put(country,countries.get(country)+population);
            }
            else
            {
                countries.put(country,population);
            }

           if(!cities.containsKey(country))
           {
               Map<String,Long> anotherCity=new LinkedHashMap<>();
               anotherCity.put(city,population);
               cities.put(country,anotherCity);
           }
           else
           {

               cities.get(country).put(city,population);
           }


        }
        countries = countries.entrySet().stream().sorted((a,b)->{
            Long operand1 =a.getValue();
            Long operand2 = b.getValue();
            return operand2.compareTo(operand1);
        }).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldValue, newValue)->oldValue, LinkedHashMap::new));

        for (Map.Entry<String, Long> country:countries.entrySet())
        {
            System.out.printf("%s (total population: %d\n",country.getKey(),country.getValue());

            for (Map.Entry<String, Map<String, Long>> city:cities.entrySet())
            {
                for(Map.Entry<String ,Long> c:city.getValue().entrySet())
                {
                    if(city.getKey().equals(country.getKey()))
                        city.getValue().entrySet().stream().sorted((t1, t2) -> t2.getValue().compareTo(t1.getValue())).forEach(citys -> {
                            System.out.println(c.getKey() + " " + c.getValue());
                        });
                }
            }
        }

    }
}

/*
import java.util.LinkedHashMap;
import java.util.Scanner;

public class c1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        LinkedHashMap<String , LinkedHashMap<String, Long>> countriesAndCities = new LinkedHashMap<>();
        LinkedHashMap<String, Long> countriesOnly = new LinkedHashMap<>();
        while(!(input = sc.nextLine()).equals("report")){
            String [] data = input.split("\\|");
            String city = data[0];
            String country = data[1];
            Long population = Long.parseLong(data[2]);

            if(!countriesAndCities.containsKey(country)){
                countriesAndCities.put(country,new LinkedHashMap<>());
                countriesOnly.put(country, 0L);
            }
            countriesOnly.put(country,countriesOnly.get(country)+population);
            if(!countriesAndCities.get(country).containsKey(city)){
                countriesAndCities.get(country).put(city,population);
            }
        }
        countriesAndCities.entrySet().stream()
                .sorted((c1,c2)-> countriesOnly.get(c2.getKey()).compareTo(countriesOnly.get(c1.getKey())))
                .forEach(country ->{
                    System.out.format("%s (total population: %d)\n",country.getKey(),countriesOnly.get(country.getKey()));
                    country.getValue().entrySet()
                            .stream().sorted((t1,t2)-> t2.getValue().compareTo(t1.getValue())).forEach(city ->{
                            System.out.format("=>%s: %d\n", city.getKey(),city.getValue());
                    });
        });
    }
}
 */
