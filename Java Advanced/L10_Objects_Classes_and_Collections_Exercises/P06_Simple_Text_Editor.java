package L10_Objects_Classes_and_Collections_Exercises;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P06_Simple_Text_Editor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        StringBuilder text=new StringBuilder();
        Deque<String> stack=new ArrayDeque<>();
        for(int i=0;i<n;i++)
        {
          String[] command=sc.nextLine().split("\\s+");
          if(command[0].equals("1"))
          {
              stack.push(text.toString());
              String append=command[1];
              text.append(append);
          }
          else if (command[0].equals("2"))
            {
                stack.push(text.toString());
                int numOfElements=Integer.parseInt(command[1]);
                text.delete(text.length()-numOfElements,text.length());
            }
          else if (command[0].equals("3"))
          {
              int index=Integer.parseInt(command[1]);

                  System.out.println(text.charAt(index - 1));

          }
          else
          {
              text=new StringBuilder(stack.pop());
          }


        }
    }
}
