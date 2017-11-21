package L02_Intro_To_Java_Exercises;

import java.util.Scanner;

public class P07_Character_Multiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        int result = 0;
        if(first.length()==second.length())
        {
           for(int i=0;i<first.length();i++)
           {
               int sum=first.charAt(i)*second.charAt(i);
               result+=sum;
           }
        }
        else
        {
           int times= Math.min(first.length(),second.length());
           int max=Math.max(first.length(),second.length());
           int jCount=0;
           for(int j=0;j<times;j++)
            {
                int sum=first.charAt(j)*second.charAt(j);
                result+=sum;
                jCount=j;
            }
            String longer="";
           if(first.length()>second.length()) {
           longer=first;
           }
           else
               longer=second;
            for(int c=jCount+1;c<max;c++)
            {
                result+=longer.charAt(c);
            }
        }
        System.out.println(result);
    }
}