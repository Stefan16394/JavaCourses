package P06_Generic_Count_Method_Double;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable> {
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

   public int compare(T value)
   {
       int count=0;
       for (T element:values)
       {
           if (element.compareTo(value)>0)
           {
               count++;
           }
       }
       return count;
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
