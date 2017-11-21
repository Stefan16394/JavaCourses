package P02_Generic_Array_Creator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayCreator {

    public static <T> T[] create(int length, T item) {
        Object[] list=new Object[length];
        for (int i = 0; i < length; i++) {
            list[i]=item;
        }
        return (T[]) list;
    }


    public static <T> T[] create(Class<T> type, int length, T item) {
        T[] list = (T[]) Array.newInstance(type,length);
        for (int i = 0; i < length; i++) {
            list[i]=item;
        }
        return list;
    }
}
