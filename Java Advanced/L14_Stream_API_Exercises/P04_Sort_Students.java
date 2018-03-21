package L14_Stream_API_Exercises;

import java.util.*;

public class P04_Sort_Students {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      HashMap<String,String> students=new HashMap<>();
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
     students.entrySet().stream().sorted((x,y)->{
            if(x.getValue().compareTo(y.getValue())==0)
            {
                return y.getKey().compareTo(x.getKey());

            }
            else {
                return x.getValue().compareTo(y.getValue());
            }
     }).forEach((x->{
            System.out.println(x.getKey()+" "+x.getValue());
        }));


    }

    private static Comparator<Map.Entry<String,String>> sort() {

        return (x,y)->{
           if(x.getValue().compareTo(y.getValue())==0)
           {
               return y.getKey().compareTo(x.getKey());

           }
           else {
               return x.getValue().compareTo(y.getValue());
           }
        };
    }


}
