package P01_Event_Implementation;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    private String name;
    private List<NameChangeListener> listeners;

    public Dispatcher() {
        this.listeners=new ArrayList<>();
    }

    public void addNameChangeListener(NameChangeListener nameChangeListener)
   {
       this.listeners.add(nameChangeListener);
   }
    public void removeNameChangeListener(NameChangeListener nameChangeListener)
    {
        if (listeners.contains(nameChangeListener))
        {
            this.listeners.remove(nameChangeListener);
        }
    }
    public void fireNameChangeEvent()
    {
        NameChange event=new NameChange(this.name);
        for (NameChangeListener listener:listeners)
        {
         listener.handleChangedName(event);
        }
    }

    public void setName(String name) {
        this.name = name;
        fireNameChangeEvent();
    }
}
