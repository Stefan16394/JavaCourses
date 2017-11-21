package L10_Objects_Classes_and_Collections_Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class P02_Maximum_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        Deque<Integer> stack=new ArrayDeque<>();
        for(int i=0;i<n;i++)
        {
            int[] input= Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if(input[0]==1)
            {
                int element=input[1];
                stack.push(element);
            }
            else if(input[0]==2)
            {
                stack.pop();
            }
            else if(input[0]==3)
            {
                System.out.println(printMaxElement(stack));
            }
        }
    }
    private static int printMaxElement(Deque<Integer> stack)
    {

        int max=-1;
        int element=0;
        int stackSize=stack.size();
        while(stackSize!=0)
        {
            element=stack.pop();
            if(element>max)
            {
                max=element;
            }
            stack.addLast(element);
            stackSize--;
        }
        return max;
    }

}
