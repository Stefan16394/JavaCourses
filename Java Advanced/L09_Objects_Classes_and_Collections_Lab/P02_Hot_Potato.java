package L09_Objects_Classes_and_Collections_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P02_Hot_Potato {
    public static void main(String[] args) {
        ArrayDeque<String> queue=new ArrayDeque<>();
        Scanner sc=new Scanner(System.in);
        String[] names=sc.nextLine().split(" ");
        for (String name:names) {
            queue.offer(name);
        }
        int n=Integer.parseInt(sc.nextLine());
        while (queue.size()!=1)
        {
            for(int i=1;i<=n;i++)
            {
                if(i==n)
                {
                    System.out.println("Removed "+queue.remove());
                }
                else
                {
                    queue.offer(queue.poll());
                }
            }
        }
        System.out.println("Last is "+queue.pop());

    }
}
