package L12_Functional_Programming_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P08_Find_The_Smallest_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Function<List<Integer>,Integer> function=new Function<List<Integer>, Integer>() {
            @Override
            public Integer apply(List<Integer> integers) {
                Integer minIndex=-1;
                Integer minElement=Integer.MAX_VALUE;
                for (int i=0;i<integers.size();i++)
                {
                    if(integers.get(i)<=minElement)
                    {
                        minElement=integers.get(i);
                        minIndex=i;
                    }
                }
                return minIndex;
            }
        };
        Integer index=function.apply(numbers);
        System.out.println(index);
    }


}
