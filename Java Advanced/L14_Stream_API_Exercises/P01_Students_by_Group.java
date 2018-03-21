package L14_Stream_API_Exercises;

import java.util.HashMap;
import java.util.Scanner;

public class P01_Students_by_Group {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> students=new HashMap<>();
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
        students.entrySet().stream().filter(x->x.getValue()==2).sorted((a,b)->a.getKey().compareTo(b.getKey()))
                .forEach(x-> System.out.println(x.getKey()));
    }
}
