package P06_Strategy_Pattern;

import java.util.Comparator;

public class firstComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int result = Integer.compare(o1.getName().length(), o2.getName().length());
        if (result != 0) {
            return result;
        }
        return Character.compare(o1.getName().toLowerCase().charAt(0), o2.getName().toLowerCase().charAt(0));

    }
}

