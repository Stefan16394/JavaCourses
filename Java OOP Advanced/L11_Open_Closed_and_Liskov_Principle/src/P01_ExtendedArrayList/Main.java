package P01_ExtendedArrayList;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
     ExtendedArrayList e=new ExtendedArrayList();
        ExtendedArrayList<Integer> list=new ExtendedArrayList<>();
        Collections.addAll(list,1,7,3,4,5);
        System.out.println(list.max());
        System.out.println(list.min());


    }
}
