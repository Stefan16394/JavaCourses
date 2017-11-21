package L11_Functional_Programing_Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P01_Sort_Even_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> array=(Arrays.stream(sc.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList()));
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(array);
        numbers.removeIf(n->n%2!=0);
        print(numbers);

        numbers.sort((a,b)->a.compareTo(b));
        print(numbers);
    }
    private static void print(ArrayList<Integer> numbers)
    {
        StringBuilder print=new StringBuilder();
        for (Integer n:numbers) {
            print.append(n).append(", ");
        }
        print.deleteCharAt(print.length()-2);

        System.out.println(print.toString());
    }
}
