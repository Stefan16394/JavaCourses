package P09_Collection_Hierarchy;

import P09_Collection_Hierarchy.Interfaces.IAddCollection;
import P09_Collection_Hierarchy.Interfaces.IRemove;
import P09_Collection_Hierarchy.Interfaces.UsedCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MyList implements UsedCollection {
    private List<String> myListCollection;

    public MyList() {
        this.myListCollection = new ArrayList<>();
    }


    @Override
    public int used() {
        return myListCollection.size();
    }

    @Override
    public String remove() {
        String removed=myListCollection.get(0);
      myListCollection.remove(0);
      return removed;
    }

    @Override
    public int add(String item) {
     myListCollection.add(0,item);
     return 0;
    }

    @Override
    public List<String> get() {
        return this.myListCollection;
    }
}
