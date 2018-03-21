package L12_Functional_Programming_Exercises;

import java.util.Scanner;
import java.util.function.Consumer;

public class P01_Consumer_Print {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Consumer<String> print=(message)-> System.out.println(message);
        String[] text=sc.nextLine().split(" ");
        for (String name:text)
        {
            print.accept(name);
        }
    }
}
