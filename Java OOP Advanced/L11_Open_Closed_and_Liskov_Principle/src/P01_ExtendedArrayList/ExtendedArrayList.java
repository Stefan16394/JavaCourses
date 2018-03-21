package P01_ExtendedArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ExtendedArrayList<T extends Comparable<T>> extends ArrayList<T>{

    public T max(){
        T max=null;
        Iterator<T> iterator=super.iterator();

        while (iterator.hasNext())
        {
            T element=iterator.next();
            if (max==null || element.compareTo(max)>0)
            {
                max=element;
            }
        }
        return max;
    }

    public T min(){
        T min=null;
        Iterator<T> iterator=super.iterator();

        while (iterator.hasNext())
        {
            T element=iterator.next();
            if (min==null || element.compareTo(min)<0)
            {
                min=element;
            }
        }
        return min;
    }

}
