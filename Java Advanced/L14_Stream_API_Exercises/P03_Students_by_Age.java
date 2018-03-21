package L14_Stream_API_Exercises;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class P03_Students_by_Age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedHashMap<String,Integer> students=new LinkedHashMap<>();
        while (true)
        {
            String[] input=sc.nextLine().split(" ");
            if(input[0].equals("END"))
            {
                break;
            }
            String name=input[0]+" "+input[1];
            Integer digit=Integer.parseInt(input[2]);
            students.put(name,digit);
        }
        students.entrySet().stream().filter(x->x.getValue()>=18 && x.getValue()<=24)
                                    .forEach(x-> System.out.println(x.getKey()+" "+x.getValue()));
    }
}
