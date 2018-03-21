package L11_Functional_Programing_Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class P05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        LinkedHashMap<String,Integer> people=new LinkedHashMap<>();
        for (int i=0;i<n;i++)
        {
         String[] input=sc.nextLine().split(", ");
         String name=input[0];
         int age=Integer.parseInt(input[1]);
         people.put(name,age);
        }
        String condition=sc.nextLine();
        Integer age=Integer.parseInt(sc.nextLine());
        String format=sc.nextLine();

        Predicate<Integer> predicate=createPredicate(condition,age);
        Consumer<Map.Entry<String, Integer>> printer = createPrinter(format);
        printFilteredStudent(people, predicate, printer);

    }
    private static void printFilteredStudent(
            LinkedHashMap<String, Integer> people,
            Predicate<Integer> predicate,
            Consumer<Map.Entry<String, Integer>> printer) {

        for (Map.Entry<String, Integer> person : people.entrySet()) {
            if (predicate.test(people.get(person.getKey()))) {
                printer.accept(person);
            }
        }
    }


    private static Consumer<Map.Entry<String,Integer>> createPrinter(String format) {
        switch (format) {
            case "name":
                return person -> System.out.printf("%s\n", person.getKey());
            case "age":
                return person -> System.out.printf("%d\n", person.getValue());
            case "name age":
                return person -> System.out.printf("%s - %d%n", person.getKey(), person.getValue());
        }
        return null;
    }

    private static Predicate<Integer> createPredicate(String condition,Integer age) {
        switch (condition)
        {
            case "younger":
                return x->x<=age;
            case "older":
                return x->x>=age;

        }
        return null;
    }
}
