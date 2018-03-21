package L10_Objects_Classes_and_Collections_Exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P11_Phonebook {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,String> colection=new HashMap<>();
        while (true)
        {
         String[] command=sc.nextLine().split("-");
          if(command[0].equals("search"))
          {
              while (true)
              {
                  String name=sc.nextLine();
                  if(name.equals("stop"))
                  {
                      return;
                  }
                  if(colection.containsKey(name))
                  {
                      System.out.printf("%s -> %s\n",name,colection.get(name));
                  }
                  else
                  {
                      System.out.printf("Contact %s does not exist.\n",name);
                  }

              }
          }

          else
          {
              String name=command[0];
              String phone=command[1];
              colection.put(name,phone);

          }
        }
    }
}
