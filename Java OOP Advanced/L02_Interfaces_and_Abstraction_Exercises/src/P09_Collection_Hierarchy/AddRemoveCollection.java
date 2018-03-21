package P09_Collection_Hierarchy;

import P09_Collection_Hierarchy.Interfaces.IAddCollection;
import P09_Collection_Hierarchy.Interfaces.IRemove;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddRemoveCollection implements IRemove{
    private List<String> addRemoveCollection;

    public AddRemoveCollection() {
        this.addRemoveCollection=new ArrayList<>();
    }


    @Override
    public int add(String item) {
        addRemoveCollection.add(0,item);
        return 0;
    }

    @Override
    public String remove() {
        String removed=addRemoveCollection.get(addRemoveCollection.size()-1);
        addRemoveCollection.remove(addRemoveCollection.size()-1);
        return removed;
    }

    @Override
    public List<String> get() {
        return this.addRemoveCollection;
    }
}
