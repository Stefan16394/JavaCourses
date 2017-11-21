package P09_Collection_Hierarchy;

import P09_Collection_Hierarchy.Interfaces.IAddCollection;
import P09_Collection_Hierarchy.Interfaces.IRemove;
import P09_Collection_Hierarchy.Interfaces.UsedCollection;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      IAddCollection addCollection=new AddCollection();
      IRemove addRemoveCollection=new AddRemoveCollection();
      UsedCollection myList=new MyList();
      String[] items=sc.nextLine().split("\\s+");
      int removeCount=sc.nextInt();

      add(items,addCollection);
      add(items,addRemoveCollection);
      add(items,myList);

      remove(removeCount,addRemoveCollection);
      remove(removeCount,myList);

    }
    private static void add(String[] items,IAddCollection collection)
    {
        for (String item : items) {

            System.out.print(collection.add(item)+" ");

        }
        System.out.println();
    }

    private static void remove(int n,IRemove collection)
    {
        for (int i=0;i<n;i++) {
            System.out.print(collection.remove()+" ");
        }
        System.out.println();
    }

}