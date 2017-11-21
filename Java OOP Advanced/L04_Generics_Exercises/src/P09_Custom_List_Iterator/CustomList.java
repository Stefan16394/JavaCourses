package P09_Custom_List_Iterator;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T extends Comparable> {
    private List<T> values;

    public CustomList() {
        this.values=new ArrayList<>();
    }

    public void add(T element)
    {
        values.add(element);
    }

    public void remove(int index)
    {
         values.remove(index);
    }

    public boolean contains(T element)
    {
        return values.contains(element);
    }

    public void swap(int index,int index2)
    {
        T temp=values.get(index);
        values.set(index,values.get(index2));
        values.set(index2,temp);
    }

    public int countGreaterThan(T element)
    {
        int count=0;
        for (T value:values)
        {
            if (value.compareTo(element)>0)
            {
                count++;
            }
        }
        return count;
    }

    public T getMax()
    {
        T max=values.get(0);
        for (int i=1;i<values.size();i++)
        {
            if (values.get(i).compareTo(max)>0)
            {
                max=values.get(i);
            }
        }
        return max;
    }

    public T getMin()
    {
        T min=values.get(0);
        for (int i=1;i<values.size();i++)
        {
            if (values.get(i).compareTo(min)<0)
            {
                min=values.get(i);
            }
        }
        return min;
    }

    public void print()
    {
        for (T element:values)
        {
            System.out.println(element);
        }
    }

    public void sort()
    {
        Sorter.sort(values);
    }
}
