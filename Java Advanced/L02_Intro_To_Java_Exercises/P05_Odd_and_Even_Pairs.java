package L02_Intro_To_Java_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P05_Odd_and_Even_Pairs {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        int[] array= Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if(array.length%2==1)
        {
            System.out.println("invalid length");
        }
        else
        {
            for (int i=0;i<=array.length-2;i=i+2)
            {
                if(array[i]%2==0 && array[i+1]%2==0)
                {
                    System.out.printf("%d, %d -> both are even%n",array[i],array[i+1]);
                }
                else if(array[i]%2==1 && array[i+1]%2==1)
                {
                    System.out.printf("%d, %d -> both are odd%n",array[i],array[i+1]);
                }
                else
                    System.out.printf("%d, %d -> different%n",array[i],array[i+1]);
            }
        }
    }
}