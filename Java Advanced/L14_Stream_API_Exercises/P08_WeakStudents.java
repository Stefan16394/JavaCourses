package L14_Stream_API_Exercises;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class P08_WeakStudents {
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
            String name=input[0]+" "+ input[1];
            List<Integer> grades=new ArrayList<>();

            for (int i=2;i<input.length;i++)
            {
                grades.add(Integer.parseInt(input[i]));
            }
            students.put(name,grades);

        }
      students.entrySet().stream().filter(filter()).forEach(printConsumer());
    }

    private static Predicate<? super Map.Entry<String,List<Integer>>> filter() {

        return x->{
            int value=0;
            for(Integer s:x.getValue())
            {
                if(s<=3)
                {
                    value++;
                }
            }
            return value>=2;
        };
    }

    private static Consumer<? super Map.Entry<String,List<Integer>>> printConsumer() {
        return kv-> {
            System.out.print(kv.getKey() + " ");
            kv.getValue().forEach(x-> System.out.print(x+" "));
            System.out.println();
        };

    }

}
