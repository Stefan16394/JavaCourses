package P04_List_Utilities;

import java.util.List;

 class  ListUtils<T extends Comparable<T>> {

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

}
