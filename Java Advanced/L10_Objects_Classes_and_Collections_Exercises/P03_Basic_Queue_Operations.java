package L10_Objects_Classes_and_Collections_Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P03_Basic_Queue_Operations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayDeque<Integer> queue=new ArrayDeque<>();
        int[] input= Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int addN=input[0];
        int removeN=input[1];
        int searchN=input[2];
        int[] elements= Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        addElements(addN,elements,queue);
        removeElements(removeN,elements,queue);
        if(queue.size()>0)
        {
            searchElement(queue,searchN);
            return;
        }
        System.out.println(0);

    }
      private static void addElements(int addN,int [] elements,ArrayDeque<Integer> queue)
      {
          for(int i=0;i<addN;i++)
          {
              queue.offer(elements[i]);
          }
      }

    private static void removeElements(int removeN,int [] elements,ArrayDeque<Integer> queue)
    {
        for(int i=0;i<removeN;i++)
        {
            queue.poll();
        }
    }

    private static void searchElement (ArrayDeque<Integer> queue,int searchN)
    {
        if(queue.contains(searchN))
        {
            System.out.println("true");
        }
        else
        {
            int min=Integer.MAX_VALUE;
            while(queue.size()>0)
            {
                int element=queue.poll();
                if(element<min)
                {
                    min=element;
                }
            }
            System.out.println(min);
        }
    }




}
