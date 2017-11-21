package L12_Functional_Programming_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P10_List_Of_Predicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        if(n<0)
        {
            return;
        }
        List<Integer> list= Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Predicate<Integer> predicate=x->{
            boolean isDivisable=false;
            for(Integer num:list)
            {
                if(x%num==0)
                {
                    isDivisable=true;
                }
                else
                {
                    isDivisable=false;
                    break;
                }
            }
            return isDivisable;
        };
        int[] numbers=fillArray(n);
        for (Integer num:numbers) {
            if(predicate.test(num))
            {
                System.out.print(num+" ");
            }
        }

    }
    private static int[] fillArray(int n)
    {
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=i+1;
        }
        return array;
    }


}
