package P07_Generic_Add_All_Method;

import java.util.ArrayList;
import java.util.List;

public class  ListUtils<T extends Comparable<T>> {

    public static <T extends Comparable<T>> T getMin(List<T> list)
    {
      if (list.size()==0)
      {
          throw new IllegalArgumentException("Empty list");
      }
      T min=list.get(0);

      for (int i=1;i<list.size();i++)
      {
        if (list.get(i).compareTo(min)<1)
        {
            min=list.get(i);
        }
      }
      return min;

    }
   public static <T extends Comparable<T>> T getMax(List<T> list)
    {
        if (list.size()==0)
        {
            throw new IllegalArgumentException("Empty list");
        }
        T min=list.get(0);
        for (int i=1;i<list.size();i++)
        {
            if (list.get(i).compareTo(min)>0)
            {
                min=list.get(i);
            }
        }
        return min;
    }

    public static List<Integer> getNullIndices(List<?> list)
    {
        List<Integer> nullIndexes=new ArrayList<>();
        for (int i=0;i<list.size();i++)
        {
            if (list.get(i)==null)
            {
                nullIndexes.add(i);
            }
        }
        return nullIndexes;
    }

    public static <T> void flatten(List<? super T> destination, List<List<? extends T>> source)
    {
        for (List<? extends T> list:source)
        {
            destination.addAll(list);
        }

    }

    public static <T> void addAll(List<? super T> destination, List<? extends T> source)
    {
        destination.addAll(source);
    }
}
