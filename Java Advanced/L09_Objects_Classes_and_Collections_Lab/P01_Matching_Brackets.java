package L09_Objects_Classes_and_Collections_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01_Matching_Brackets {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        Scanner sc=new Scanner(System.in);
        String expression=sc.nextLine();
         for(int i=0;i<expression.length();i++)
        {
            char ch=expression.charAt(i);
            if(ch =='(')
            {
                stack.push(i);
            }
            else if(ch==')')
            {
                System.out.println(expression.substring(stack.pop(),i+1));
            }
        }
    }
}
