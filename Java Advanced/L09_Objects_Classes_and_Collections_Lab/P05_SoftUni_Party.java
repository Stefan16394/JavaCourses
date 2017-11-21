package L09_Objects_Classes_and_Collections_Lab;

import java.util.Scanner;
import java.util.TreeSet;

public class P05_SoftUni_Party {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeSet<String> guests=new TreeSet<>();
        while (true)
        {
            String newGuest=sc.nextLine();
            if(newGuest.equals("PARTY"))
            {
                break;
            }
            guests.add(newGuest);
        }
        while(true)
        {
            String arrival=sc.nextLine();
            if(arrival.equals("END"))
            {
                break;
            }
            guests.remove(arrival);
        }
        int didntShowup=guests.size();
        System.out.println(didntShowup);
        for (String guest:guests) {
            System.out.println(guest);
        }
    }
}
