package P07_Food_Shortage;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.valueOf(sc.nextLine());
        List<Buyer> persons=new ArrayList<>();

        for (int i=0;i<n;i++)
        {
            String[] input=sc.nextLine().split(" ");
            if (input.length==4)
            {
                Buyer person=new Citizen(input[0],Integer.valueOf(input[1]),input[2],input[3]);
                persons.add(person);
            }
            else if (input.length==3)
            {
                Buyer person=new Rebel(input[0],Integer.valueOf(input[1]),input[2]);
                persons.add(person);
            }
        }
        while (true)
        {
            String person=sc.nextLine();
            if (person.equals("End"))
            {
                break;
            }
            Optional<Buyer> buyer=persons.stream().filter(x->x.getName().equals(person)).findAny();
            if (buyer.isPresent())
            {
                buyer.get().buyFood();
            }
        }

        Function<List<Buyer>,Integer> f= (x)->{
            int foo2=0;
            for (Buyer buyer:x)
            {
                foo2+=buyer.getFood();
            }
            return foo2;
        };

        System.out.println(f.apply(persons));
    }
}
