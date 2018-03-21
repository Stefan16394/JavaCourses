package P01_Listerator;

import java.util.Iterator;
import java.util.List;

 class Listerator implements Iterator {
    private int index;
    private List<String> strings;

    public Listerator(List<String> strings) {
        this.strings = strings;
        this.index=0;
    }

    public boolean move()
    {
     if (hasNext())
     {
         index++;
         return true;
     }
     return false;
    }

    public void print()
    {   if (strings.size()==0)
    {
        throw new IllegalArgumentException("Invalid Operation!");
    }
        System.out.println(strings.get(index));
    }


    @Override
    public boolean hasNext() {
        return this.strings.size()-1>index;
    }

    @Override
    public Object next() {
        return null;
    }
}
