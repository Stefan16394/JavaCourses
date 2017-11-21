package P02_Generic_Array_Creator;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
     Object[] strings= ArrayCreator.create(10,"None");
     Integer[] integers=ArrayCreator.create(Integer.class,10,1);
     for (Object s:strings)
     {
         System.out.println(s);
     }
     for (Integer i:integers)
     {
         System.out.println(i);
     }
    }
}
