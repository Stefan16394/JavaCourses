package P06_Generic_Flat_Method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers=new ArrayList<>();
        Collections.addAll(integers,1,2,3);
        List<Double> doubles=new ArrayList<>();
        Collections.addAll(doubles,1.32,42.123,15.151);
        List<List<? extends Number>> lists=new ArrayList<>();
        Collections.addAll(lists,integers,doubles);

        List<Number> numbers=new ArrayList<>();
        ListUtils.flatten(numbers,lists);
        for (Number n:numbers)
        {
            System.out.println(n);
        }
    }
}
