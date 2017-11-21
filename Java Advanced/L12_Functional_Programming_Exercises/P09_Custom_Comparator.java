package L12_Functional_Programming_Exercises;


import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;
import java.util.function.Predicate;


public class P09_Custom_Comparator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array= Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Predicate<Integer> predicate=n->Math.abs(n)%2==0;
        boolean find=true;
        List<Integer>even = new ArrayList<>();
        List<Integer> odd=new ArrayList<>();
        even(array,predicate,even,odd);
        Collections.sort(even);
        Collections.sort(odd);
        print(even);
        print(odd);

    }
    private static void even(int[] array, Predicate<Integer> predicate, List<Integer> even, List<Integer> odd)
    {

        for(Integer x:array)
        {
            if(predicate.test(x))
            {
                even.add(x);
            }
            else
                odd.add(x);
        }

    }
    private static void print(List<Integer> set)
    {
        for(Integer x:set)
        {
            System.out.print(x+" ");
        }
    }


}
