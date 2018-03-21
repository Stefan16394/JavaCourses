package P05_Comparing_Objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        while (true) {
            String[] input = sc.nextLine().split("\\s+");
            if (input[0].equals("END")) {
                break;
            }
            Person person = new Person(input[0],Integer.valueOf(input[1]),input[2]);
            personList.add(person);
        }
        int index=sc.nextInt();
        Person person=personList.get(index-1);
        personList.remove(index-1);
        int counter=1;
        for (Person p:personList)
        {
            if (p.compareTo(person)==0)
            {
                counter++;
            }
        }
       if (counter==1)
       {
           System.out.println("No matches");
       }
       else
       {
           System.out.println(counter+" "+(personList.size()+1-counter)+" "+(personList.size()+1));
       }
    }
}
