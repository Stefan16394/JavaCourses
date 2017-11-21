package L14_Stream_API_Exercises;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class P05_Filter_Students_by_Email_Domain {
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
            String name=input[0]+" "+input[1];
            String email=input[2];
            students.put(name,email);
        }
        students.entrySet().stream().filter(x->x.getValue().endsWith("@gmail.com"))
                           .forEach(x-> System.out.println(x.getKey()+" "+x.getValue()));

    }
}
