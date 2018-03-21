package L13_StreamAPI_Lab;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class P07_Map_Districts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,TreeSet<Integer>> towns=new HashMap<>();
        String[] input=sc.nextLine().split(" ");
        int n=sc.nextInt();
        for(int i=0;i<input.length;i++)
        {
            String cityName=input[i].split(":")[0];
            Integer population= Integer.valueOf(input[i].split(":")[1]);
            if(!towns.containsKey(cityName))
            {
                towns.put(cityName,new TreeSet<>());
            }
            towns.get(cityName).add(population);

        }
        towns.entrySet().stream().filter(filterByPopulation(n))
                                 .sorted(sortByDescendingPopulation())
                                 .forEach(printConsumer());
    }

    private static Consumer<Map.Entry<String,TreeSet<Integer>>> printConsumer() {
        return kv->{
            System.out.print(kv.getKey()+": ");
            kv.getValue().stream().limit(5).sorted((a,b)->b.compareTo(a)).forEach(
                    dp-> System.out.print(dp+" "));
            System.out.println();

        };
    }

    private static Comparator<Map.Entry<String,TreeSet<Integer>>> sortByDescendingPopulation() {
        return (kv1,kv2)->Integer.compare(
                kv2.getValue().stream().mapToInt(Integer::valueOf).sum(),
                kv1.getValue().stream().mapToInt(Integer::valueOf).sum());

    }

    private static Predicate<Map.Entry<String,TreeSet<Integer>>> filterByPopulation(int n) {
        return kv->kv.getValue().stream().mapToInt(Integer::valueOf).sum()>=n;
    }

}
