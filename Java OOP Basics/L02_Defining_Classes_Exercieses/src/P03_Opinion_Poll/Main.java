package P03_Opinion_Poll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<Person> list=new ArrayList<>();
        for (int i=0;i<n;i++)
        {
            String[] input=sc.nextLine().split("\\s+");
            String name=input[0];
            int age=Integer.parseInt(input[1]);
            Person person=new Person(name,age);
            list.add(person);
        }
        list.stream().filter(x->x.getAge()>30).sorted((a,b)->a.getName().compareTo(b.getName())).forEach(y->{
            System.out.printf("%s - %d\n",y.getName(),y.getAge());
        });
    }
}
