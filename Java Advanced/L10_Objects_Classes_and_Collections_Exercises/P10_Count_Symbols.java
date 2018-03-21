package L10_Objects_Classes_and_Collections_Exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P10_Count_Symbols {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        TreeMap<Character,Integer> letters=new TreeMap<>();
        for (char letter:text.toCharArray()) {
            if(!letters.containsKey(letter))
            {
                letters.put(letter,1);
            }
            else
            {
                letters.put(letter,letters.get(letter)+1);
            }

        }

        for (Map.Entry<Character, Integer> key:letters.entrySet()) {
            System.out.printf("%s: %d time/s\n",key.getKey(),key.getValue());
        }

    }


}
