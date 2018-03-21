package P07_Generic_Add_All_Method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers=new ArrayList<>();
        Collections.addAll(integers,1,2,3);
        List<Double> doubles=new ArrayList<>();
        Collections.addAll(doubles,1.32,42.123,15.151);
        List<String> strings=new ArrayList<>();
        Collections.addAll(strings,"Stefko","sdsd");
        List<List<?>> lists=new ArrayList<>();
        Collections.addAll(lists,integers,doubles,strings);

        List<Object> numbers=new ArrayList<>();
        ListUtils.addAll(numbers,lists);
        for (Object n:numbers)
        {
            System.out.println(n);
        }
    }
}
