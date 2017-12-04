package P06_Strategy_Pattern;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Person> firstComp=new TreeSet<>(new firstComparator());
        Set<Person> secondComp=new TreeSet<>(new secondComparator());
        int n=Integer.valueOf(sc.nextLine());
        for (int i=0;i<n;i++)
        {
            String[] input=sc.nextLine().split("\\s+");
            Person person=new Person(input[0],Integer.valueOf(input[1]));
            firstComp.add(person);
            secondComp.add(person);
        }
        print(firstComp);
        print(secondComp);
    }
    private static void print(Set<Person> set)
    {    StringBuilder sb=new StringBuilder();
        for (Person p:set)
        {
            sb.append(p.toString()).append("\n");
        }
        System.out.print(sb.toString());
    }
}
