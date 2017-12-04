package P02_Collection;

import java.util.Iterator;
import java.util.List;

public class Listerator implements Iterable<String> {
    private int index;
    private String[] strings;

    public Listerator(String[] strings) {
        this.strings = strings;
        this.index=0;
    }

    public boolean move()
    {
     if (hasNext())
     {
         this.index++;
         return true;
     }
     return false;
    }

    public boolean hasNext() {
        return strings.length-1>this.index;
    }

    public void print()
    {   if (strings.length==0)
    {
        throw new IllegalArgumentException("Invalid Operation!");
    }
        System.out.println(strings[index]);
    }

    public void printAll()
    {
        if (strings.length==0)
        {
            throw new IllegalArgumentException("Invalid Operation!");
        }
        else
        {
            for (String s:this)
            {
                System.out.print(s+" ");
            }

        }

    }

    @Override
    public Iterator<String> iterator() {
        return new IterateList();
    }

    private class IterateList implements Iterator<String>
    {
        private int index;

        public IterateList() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return strings.length>index;
        }

        @Override
        public String next() {
            return strings[this.index++];
        }
    }
}
