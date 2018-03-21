package L12_Functional_Programming_Exercises;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class P07_Predicate_For_Names {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=Integer.parseInt(sc.nextLine());
        String[] names=sc.nextLine().split(" ");
        Predicate<String> size=x->x.length()<=length;
        Consumer<String> print=a->
        {
            if(size.test(a))
            {
                System.out.println(a);
            }
        };
        for(String name:names)
        {
            print.accept(name);
        }


    }
}
