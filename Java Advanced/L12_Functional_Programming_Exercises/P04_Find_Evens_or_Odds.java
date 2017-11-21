package L12_Functional_Programming_Exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class P04_Find_Evens_or_Odds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] bounds= Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int start=bounds[0];
        int end=bounds[1];
        String type=sc.nextLine();
        int[] array=new int[end-start+1];
        int c=0;
        for(int i=start;i<=end;i++)
        {
            array[c]=i;
            c++;
        }
        Predicate<Integer> evenOrOdd=isEvenOdd(type);
        Consumer<Integer> print=print(array,evenOrOdd);
    }

    private static Consumer<Integer> print(int[] array,Predicate<Integer> evenOrOdd) {
        for (int x:array)
        {
            if(evenOrOdd.test(x))
            {
                System.out.print(x+" ");
            }
        }
        return null;
    }

    private static Predicate<Integer> isEvenOdd(String type) {
        switch (type){
            case "even":
                return x->Math.abs(x)%2==0;
            case "odd":
                return x->Math.abs(x)%2==1;
        }
        return null;
    }
}
