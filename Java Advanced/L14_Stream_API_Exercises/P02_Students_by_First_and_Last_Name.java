package L14_Stream_API_Exercises;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class P02_Students_by_First_and_Last_Name {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedHashMap<String,String> students=new LinkedHashMap<>();
        while (true)
        {
            String[] input=sc.nextLine().split(" ");
            if(input[0].equals("END"))
            {
                break;
            }
            String name=input[0];
            String lastName=input[1];
            students.put(name,lastName);
        }
        students.entrySet().stream().filter(x-> x.getKey().compareTo(x.getValue()) < 0)
                                    .forEach(x-> System.out.println(x.getKey()+" "+x.getValue()));
    }
}
