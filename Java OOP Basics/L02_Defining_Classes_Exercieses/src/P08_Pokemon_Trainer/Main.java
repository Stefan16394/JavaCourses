package P08_Pokemon_Trainer;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedHashMap<String,Trainer> map=new LinkedHashMap<>();
        while (true)
        {
            String[] input=sc.nextLine().split("\\s+");
            if (input[0].equals("Tournament"))
            {
                break;
            }
            String trainer=input[0];
            String pokemon=input[1];
            String pokeType=input[2];
            int pokeHP=Integer.parseInt(input[3]);

            if (!map.containsKey(trainer))
            {
                Pokemon pokemon1=new Pokemon(pokemon,pokeType,pokeHP);
                List<Pokemon> list=new ArrayList<>();
                list.add(pokemon1);
                Trainer trainer1=new Trainer(trainer,list);
                map.put(trainer,trainer1);
            }
            else
            {
                Pokemon pokemon1=new Pokemon(pokemon,pokeType,pokeHP);
                map.get(trainer).getPokemonsList().add(pokemon1);
            }
        }
        while (true)
        {
            String input=sc.nextLine();
            if (input.equals("End"))
            {
                break;
            }
            for (Map.Entry<String, Trainer> trainers:map.entrySet())
            {   boolean result=false;
                for (Pokemon x:trainers.getValue().getPokemonsList())
                {
                    if (x.getElement().equals(input))
                    {
                        result=true;
                        break;
                    }
                }
                if (result)
                {
                    trainers.getValue().setBadges();
                }
                else
                {
                    for (Pokemon x:trainers.getValue().getPokemonsList())
                    {
                        x.dropHP();
                    }
                    List<Pokemon> list=trainers.getValue().getPokemonsList().stream().filter(x->x.getHealht()>0)
                    .collect(Collectors.toList());
                    trainers.getValue().setPokemonsList(list);
                }
            }
        }
        map.entrySet().stream().sorted((a,b)->{
            int first=a.getValue().getBadges();
            int second=b.getValue().getBadges();

                return Integer.compare(second,first);


        }).forEach(x->{
            System.out.printf("%s %d %d\n",x.getKey(),x.getValue().getBadges(),x.getValue().getPokemonsList().size());
        });
    }
}
