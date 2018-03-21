package P05_Null_Finder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers=new ArrayList<>();
        Collections.addAll(integers,1,23,null,42,12,44,21,230);
        List<Character> characters=new ArrayList<>();
        Collections.addAll(characters,'a','x','d','s','g');
        System.out.println(ListUtils.getNullIndices(integers));

        System.out.println(ListUtils.getMin(integers));
        System.out.println(ListUtils.getMax(integers));
        System.out.println(ListUtils.getMin(characters));
        System.out.println(ListUtils.getMax(characters));
    }
}
