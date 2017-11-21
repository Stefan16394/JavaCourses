package P03_Generic_Swap_Method_String;

import java.util.ArrayList;
import java.util.List;

 class Box<T> {
    private List<T> values;

    public Box() {
        this.values=new ArrayList<>();
    }

    public List<T> getValues() {
        return values;
    }

    public void swap(int a,int b)
    {
        T temp=values.get(a);
        values.set(a,values.get(b));
        values.set(b,temp);


    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        for (T value:values)
        {
            sb.append(String.format("%s: %s\n",value.getClass().getCanonicalName(),value));
        }
        return sb.toString();
    }
}
