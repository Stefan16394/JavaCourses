package E06_Java_Fundamentals_Retake_08_May_2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class P01_Royalism {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String[] strings=sc.readLine().split("\\s+");
        ArrayDeque<String> royalists=new ArrayDeque<>();
        ArrayDeque<String> notRoyalists=new ArrayDeque<>();
        for(String s:strings)
        {   int sum=0;
            for(char x:s.toCharArray())
            {
              sum+=(int)x;
              while (sum>26)
              {
                  sum-=26;
              }
            }
            if(sum==18)
            {
                royalists.addLast(s);
            }
            else
            {
                notRoyalists.addLast(s);
            }
        }
        if(royalists.size()>=notRoyalists.size())
        {
            System.out.println("Royalists - "+royalists.size());
            while (royalists.size()>0) {
                System.out.println(royalists.pop());
            }
            System.out.println("All hail Royal!");
            return;
        }
        while (notRoyalists.size()>0) {
            System.out.println(notRoyalists.pop());
        }
        System.out.println("Royalism, Declined!");
    }
}
