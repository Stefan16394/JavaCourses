package P04_Froggy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {

    private int[] numbers;

    public Lake(int[] numbers) {
        this.numbers = numbers;
    }

    private class Frog implements Iterator<Integer>{
        private List<Integer> indexes;
        private int index;

        public Frog() {
            this.setIndexes();
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return indexes.size()>index;
        }

        @Override
        public Integer next() {
            return indexes.get(index++);
        }

        public void setIndexes() {
            this.indexes=new ArrayList<>();
            for (int i=0;i<numbers.length;i++)
            {
                if (i%2==0)
                {
                    indexes.add(numbers[i]);
                }
            }
            for (int i=0;i<numbers.length;i++)
            {
                if (i%2==1)
                {
                    indexes.add(numbers[i]);
                }
            }

        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }
}
