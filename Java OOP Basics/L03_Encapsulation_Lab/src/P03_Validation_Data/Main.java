package P03_Validation_Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(sc.readLine());
        List<Person> persons=new ArrayList<>();
        for (int i=0;i<n;i++)
        {   String[] input=sc.readLine().split(" ");
        try {
            Person person=new Person(input[0],input[1],Integer.valueOf(input[2]),Double.valueOf(input[3]));
             persons.add(person);
         }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        }
        int bonus = Integer.parseInt(sc.readLine());
        for (Person person : persons) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }
    }
}
