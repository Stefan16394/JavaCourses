package L12_Functional_Programming_Exercises;

import java.util.Scanner;
import java.util.function.Consumer;

public class P02_Knights_of_Honor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Consumer<String> printSir=(message)-> System.out.println("Sir "+message);
        String[] text=sc.nextLine().split("\\s+");
        for (String name:text)
        {
            printSir.accept(name);
        }
    }
}
