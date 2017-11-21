package L12_Functional_Programming_Exercises;

import com.sun.org.apache.bcel.internal.classfile.ConstantInteger;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class P06_Reverse_and_Exclude {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array= Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n=sc.nextInt();
        Predicate<Integer> divisible=x->Math.abs(x%n)==0;
        Consumer<Integer> reversePrint=(a)->
        {
            if(!divisible.test(a))
            {
                System.out.print(a+" ");
            }
        };
        for (int i=array.length-1;i>=0;i--)
        {
            reversePrint.accept(array[i]);

        }

    }
}
