package L02_Intro_To_Java_Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P08_First_Odd_or_Even_Elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array= Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] command=sc.nextLine().split(" ");
        int count=Integer.parseInt(command[1]);
        String type=command[2];
        List<Integer> list=new ArrayList<>();

        for (int i=0;i<array.length;i++)
        {
            if(type.equals("odd"))
            {
             if(Math.abs(array[i]%2)==1)
             {
                 list.add(array[i]);
                 count--;

             }
            }
            else if(type.equals("even"))
            {
                if(Math.abs(array[i]%2)==0)
                {
                    list.add(array[i]);
                    count--;

                }
            }

            if(count==0)
            {
                break;
            }
        }


            for (int x:list) {
                System.out.print(x+" ");
            }



    }
}