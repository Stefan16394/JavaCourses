package P03_Stack_Iterator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack stack=new Stack();
        while (true)
        {
            String[] input=sc.nextLine().split("[, ]+");
            if (input[0].equals("END"))
            {
                break;
            }
            switch (input[0])
            {
                case "Push":
                    int[] elements=new int[input.length-1];
                    for (int i=1;i<input.length;i++)
                    {
                        elements[i-1]=Integer.valueOf(input[i]);
                    }
                    stack.push(elements);
                break;
                case "Pop":
                    stack.pop();
                    break;
            }
        }
        if (stack.getStartIndex()<0)
        {
            System.out.println("No elements");
            return;
        }
        for (Integer x:stack)
        {
            System.out.println(x);
        }
        for (Integer x:stack)
        {
            System.out.println(x);
        }
    }
}
