package P06_Strategy_Pattern;

import java.util.Comparator;

public class secondComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1,Person o2) {
        return Integer.compare(o1.getAge(),o2.getAge());
    }
}
