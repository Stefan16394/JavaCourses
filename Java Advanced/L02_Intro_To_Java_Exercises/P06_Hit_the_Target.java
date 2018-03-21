package L02_Intro_To_Java_Exercises;

import java.util.Scanner;

public class P06_Hit_the_Target {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=20;i++)
        {
            for(int j=1;j<=20;j++)
            {
                if(i+j==n)
                {
                    System.out.println(i+" + "+j+" = "+n);

                }
            }
        }
        for (int i=1;i<=20;i++)
        {
            for(int j=1;j<=20;j++)
            {
                if(i-j==n)
                {
                    System.out.println(i+" - "+j+" = "+n);

                }
            }
        }
    }
}