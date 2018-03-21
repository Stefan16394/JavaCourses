package L11_Functional_Programing_Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String[] input=sc.nextLine().split(", ");
       Function<String,Integer> parser=x->Integer.parseInt(x);
       int sum=0;
       for(String s:input)
       {
           sum+=parser.apply(s);
       }
        System.out.println("Count = "+input.length);
        System.out.println("Sum = "+sum);
    }


}
