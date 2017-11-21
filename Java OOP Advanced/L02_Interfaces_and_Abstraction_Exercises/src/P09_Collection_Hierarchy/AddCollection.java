package P09_Collection_Hierarchy;

import P09_Collection_Hierarchy.Interfaces.IAddCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddCollection implements IAddCollection {
    private List<String> addCollection;

    public AddCollection() {
        this.addCollection = new ArrayList<>();
    }

    @Override
    public int add(String item) {
        int size=addCollection.size();
        addCollection.add(item);
        return size;
    }

    @Override
    public List<String> get() {
        return this.addCollection;
    }


}
