package L04_Abstraction_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P09_Terrorists_Win {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        char[] s=input.toCharArray();
        List<Integer> bombs=new ArrayList<>();
        for(int i=0;i<input.length();i++)
        {
            if(s[i]=='|')
            {
                bombs.add(i);
            }
        }
        for(int i=0;i<=bombs.size()/2;i+=2)
        {
            int from=bombs.get(i);
            int to=bombs.get(i+1);
            int sum=0;
            for(int j=from+1;j<to;j++)
            {
                sum+=s[j];
            }
            int power=sum%10;
            from=from-power;
            to=to+power+1;
            if (from<0)
            {
                from=0;
            }
            if(to>input.length()-1)
            {
                to=input.length();
            }
            String replace=input.substring(from,to);
            int n=replace.length();
            String repeated = new String(new char[n]).replace("\0", ".");

            input=input.replace(replace,repeated);
        }
        System.out.println(input);

    }
}
