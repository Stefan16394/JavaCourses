package L02_Intro_To_Java_Exercises;

import java.util.Scanner;

public class P11_Game_of_Names {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String message="";
        int score=-999999999;
        for (int i=0;i<n;i++)
        {
            String name=sc.nextLine();
            int initialScore=Integer.parseInt(sc.nextLine());
            for (int c=0;c<name.length();c++)
            {
                int points=name.charAt(c);
                if(points%2==0)
                {
                    initialScore+=points;
                }
                else
                    initialScore-=points;
            }
            if(initialScore>score)
            {
                message=String.format("The winner is %s - %d points",name,initialScore);
                score=initialScore;
            }
        }
        System.out.println(message);
    }
    }
