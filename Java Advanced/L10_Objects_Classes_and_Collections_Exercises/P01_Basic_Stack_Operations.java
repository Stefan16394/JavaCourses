package L10_Objects_Classes_and_Collections_Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class P01_Basic_Stack_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int pushN = input[0];
        int popN = input[1];
        int searchNum = input[2];
        int[] numbers = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Deque<Integer> stack = new ArrayDeque<Integer>();
        pushElementsInStack(stack,pushN,numbers);
        popElementsFromStack(stack,popN,numbers);
        if(stack.size()>0)
        {
            searchForElementO(stack,searchNum);
            return;
        }
        System.out.println(0);
    }

    private static void pushElementsInStack(Deque<Integer> stack,int pushN,int[] numbers)
    {
        for (int i=0;i<pushN;i++)
        {
            stack.push(numbers[i]);
        }
    }

    private static void popElementsFromStack(Deque<Integer> stack,int popN,int[] numbers)
    {
        for (int i=0;i<popN;i++)
        {
            stack.pop();
        }
    }

    private static void searchForElementO(Deque<Integer> stack,int searchNum)
    {
        if(stack.contains(searchNum))
        {
            System.out.println("true");
        }
        else
        {   int min=999999999;
            while(stack.size()>0)
            {
                int element=stack.pop();
                if(element<min)
                {
                    min=element;
                }
            }
            System.out.println(min);
        }
    }
}





