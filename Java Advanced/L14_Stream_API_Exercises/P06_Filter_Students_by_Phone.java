package L14_Stream_API_Exercises;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class P06_Filter_Students_by_Phone {
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
            String phone=input[2];
            students.put(name,phone);
        }
        students.entrySet().stream().filter(x->x.getValue().startsWith("02")||x.getValue().startsWith("+3592"))
                                    .forEach(x-> System.out.println(x.getKey()+" "+x.getValue()));
    }

}
