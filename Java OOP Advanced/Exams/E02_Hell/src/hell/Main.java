package hell;

import hell.IO.ConsoleReader;
import hell.interfaces.InputReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, NoSuchFieldException, IllegalAccessException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Controller c=new Controller();
        InputReader sc=new ConsoleReader(reader);
        while (true)
        {
          String[] command=sc.readLine().split("\\s+");
          switch (command[0])
          {
              case "Hero":
                  c.createHero(command[1],command[2]);
                  break;
              case "Item":
                  c.createItem(command[1],command[2],Integer.valueOf(command[3]),Integer.valueOf(command[4]),
                          Integer.valueOf(command[5]),Integer.valueOf(command[6]),Integer.valueOf(command[7]));
                  break;
              case "Recipe":
                  List<String> requiredItems=new ArrayList<>();
                  for (int i=8;i<command.length;i++)
                  {
                      requiredItems.add(command[i]);
                  }
                  c.createRecipe(command[1],command[2],Integer.valueOf(command[3]),Integer.valueOf(command[4]),
                          Integer.valueOf(command[5]),Integer.valueOf(command[6]),Integer.valueOf(command[7]),
                          requiredItems);
                  break;
              case "Inspect":
                  c.inspect(command[1]);
                  break;
              case "Quit":
                  c.quit();
                  return;
          }
        }
    }
}