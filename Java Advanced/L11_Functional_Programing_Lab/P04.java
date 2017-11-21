package L11_Functional_Programing_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class P04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] input=sc.nextLine().split(", ");
        List<Double> numbers=new ArrayList<>();
        for(String s:input)
        {
            numbers.add(Double.parseDouble(s));
        }
        Function<Double,Double> vats=a->a*1.2;
        System.out.println("Prices with VAT:");
        for (Double x:numbers)
        {
            String y=String.valueOf(String.format("%.2f",vats.apply(x))).replace('.',',');
            System.out.println(y);

        }
    }
}
