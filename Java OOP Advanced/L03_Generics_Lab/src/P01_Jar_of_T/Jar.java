package P01_Jar_of_T;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jar<T> {

    private List<T> stuff;

    Jar() {
        this.stuff = new ArrayList<>();
    }

    void add(T element) {
        this.stuff.add(0, element);
    }

    public T remove() {
        return this.stuff.remove(0);
    }

    public List<T> getStuff() {
        return Collections.unmodifiableList(stuff);
    }
}
