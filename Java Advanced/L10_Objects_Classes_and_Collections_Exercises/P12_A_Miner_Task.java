package L10_Objects_Classes_and_Collections_Exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P12_A_Miner_Task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> colection=new HashMap<>();
        while (true)
        {
            String resourse=sc.nextLine();
            if(resourse.equals("stop"))
            {
                break;
            }
            int quantity=Integer.parseInt(sc.nextLine());
            if(!colection.containsKey(resourse))
            {
                colection.put(resourse,quantity);
            }
            else
            {
                colection.put(resourse,colection.get(resourse)+quantity);
            }
        }
        for (Map.Entry<String, Integer> resource:colection.entrySet()) {
            System.out.printf("%s -> %d\n",resource.getKey(),resource.getValue());
        }
    }
}
