package P03_Stack_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stack implements Iterable<Integer> {
    private List<Integer> numbers;
    private int startIndex;

    public Stack() {
        this.numbers = new ArrayList<>();
        this.startIndex =0;
    }

    public void push(int[] elements)
    {
        for (int i=0;i<elements.length;i++)
        {
            numbers.add(startIndex,elements[i]);
            this.startIndex++;
        }
    }

    public void pop()
    {
        this.startIndex--;
    }

    public int getStartIndex() {
        return startIndex;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new StackIterator();
    }

    private class StackIterator  implements Iterator<Integer>
    {
        private int startIndex;

        public StackIterator() {
            this.startIndex=getStartIndex()-1;
        }

        @Override
        public boolean hasNext() {
            return this.startIndex>=0;
        }

        @Override
        public Integer next() {
            return numbers.get(this.startIndex--);
        }

    }
}
