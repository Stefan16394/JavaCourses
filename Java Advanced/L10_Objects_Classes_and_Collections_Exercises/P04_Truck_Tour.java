package L10_Objects_Classes_and_Collections_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P04_Truck_Tour {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int numberOfPumps=Integer.parseInt(reader.readLine());
        ArrayDeque<String> allPumps=new ArrayDeque<>();

        for(int i=0;i<numberOfPumps;i++)
        {
            allPumps.addLast(reader.readLine());
        }

        int counter=0;
        while (true)
        {
            Long ourFuel=0L;
            boolean found=true;
            for (String petrolPomp:allPumps) {

                Long currentFuel=Long.valueOf(petrolPomp.split(" ")[0]);
                Long distance=Long.valueOf(petrolPomp.split(" ")[1]);
                ourFuel+=currentFuel;

                if(ourFuel<distance)
                {
                    found=false;
                    break;
                }
                ourFuel-=distance;

            }

            if(found)
            {
                System.out.println(counter);
                break;
            }
            allPumps.addLast(allPumps.pop());

            counter++;

        }
    }
}
