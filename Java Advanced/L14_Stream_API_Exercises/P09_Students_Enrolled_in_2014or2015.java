package L14_Stream_API_Exercises;

import java.util.*;
import java.util.function.Consumer;

public class P09_Students_Enrolled_in_2014or2015 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedHashMap<String,List<Integer>> students=new LinkedHashMap<>();
        while (true)
        {
            String[] input=sc.nextLine().split(" ");
            if(input[0].equals("END"))
            {
                break;
            }
            String name=input[0];
            List<Integer> grades=new ArrayList<>();

            for (int i=1;i<input.length;i++)
            {
                grades.add(Integer.parseInt(input[i]));
            }
            students.put(name,grades);

        }
        students.entrySet().stream().filter(x->x.getKey().endsWith("14")||x.getKey().endsWith("15"))
                                    .forEach(print());
    }

    private static Consumer<? super Map.Entry<String,List<Integer>>> print() {
        return k->{
            k.getValue().forEach(x-> System.out.print(x+" "));
            System.out.println();
        };
    }


}

