package P09_Google;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,Person> map=new LinkedHashMap<>();
        while (true)
        {
            String[] input=sc.nextLine().split("\\s+");
            if (input[0].equals("End"))
            {
                break;
            }
            String name=input[0];
            switch (input[1])
            {
                case "company":

                    String companyName=input[2];
                    String department=input[3];
                    double salary=Double.valueOf(input[4]);

                    if (!(map.containsKey(name)))
                    {   Person person=new Person();

                        person.createCompany(companyName,department,salary);
                        map.put(name,person);
                    }
                    else
                    {
                        Person person=map.get(name);
                        person.createCompany(companyName,department,salary);
                    }
                    break;

                case "pokemon":
                    String pokemonName=input[2];
                    String pokemonType=input[3];
                    if (!(map.containsKey(name)))
                    {   Person person=new Person();

                        person.createPokemon(pokemonName,pokemonType);
                        map.put(name,person);
                    }
                    else
                    {
                        Person person=map.get(name);
                        person.createPokemon(pokemonName,pokemonType);

                    }
                    break;
                case "parents":
                    String personName=input[2];
                    String personBirthday=input[3];
                    if (!(map.containsKey(name)))
                    {   Person person=new Person();

                        person.createParent(personName,personBirthday);
                        map.put(name,person);
                    }
                    else
                    {
                        Person person=map.get(name);
                        person.createParent(personName,personBirthday);

                    }
                    break;
                case "children":
                    String childName=input[2];
                    String childBirthday=input[3];
                    if (!(map.containsKey(name)))
                    {   Person person=new Person();

                        person.createChildren(childName,childBirthday);
                        map.put(name,person);
                    }
                    else
                    {
                        Person person=map.get(name);
                        person.createChildren(childName,childBirthday);

                    }
                    break;
                case "car":
                    String model=input[2];
                    String speed=input[3];
                    if (!(map.containsKey(name)))
                    {   Person person=new Person();

                        person.createCar(model,speed);
                        map.put(name,person);
                    }
                    else
                    {
                        Person person=map.get(name);
                        person.createCar(model,speed);

                    }
                    break;

            }
        }
        String printPerson=sc.nextLine();
        Person person=map.get(printPerson);
        System.out.println(printPerson);
        person.printResults();

    }
}
