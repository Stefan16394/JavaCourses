package L14_Stream_API_Exercises;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;
import java.util.function.Consumer;

public class P07_Excellent_Students {
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
        students.entrySet().stream().filter(x->x.getValue().contains(6))
                                    .forEach(printConsumer());
    }

    private static Consumer<? super Map.Entry<String,List<Integer>>> printConsumer() {
        return kv-> {
            System.out.print(kv.getKey() + " ");
            kv.getValue().stream().forEach(x-> System.out.print(x+" "));
            System.out.println();
        };

    }

}
