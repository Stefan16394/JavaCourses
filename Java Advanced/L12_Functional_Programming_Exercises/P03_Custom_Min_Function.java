package L12_Functional_Programming_Exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class P03_Custom_Min_Function {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array= Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Function<int[],Integer> minElement=new Function<int[], Integer>() {
            @Override
            public Integer apply(int[] integers) {
                int min=Integer.MAX_VALUE;
                for (Integer x:array)
                {
                    if(x<min)
                    {
                        min=x;
                    }
                }
                return min;
            }
        };
        int minEl=minElement.apply(array);
        System.out.println(minEl);
    }




}
