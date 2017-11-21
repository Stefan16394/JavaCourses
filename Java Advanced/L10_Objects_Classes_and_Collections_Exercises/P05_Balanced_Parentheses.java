package L10_Objects_Classes_and_Collections_Exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P05_Balanced_Parentheses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayDeque<Character> queue=new ArrayDeque<>();
        char[] text=sc.nextLine().toCharArray();
        for (char x:text) {
            queue.offer(x);
        }
        if(queue.size()%2==1)
        {
            System.out.println("NO");
        }
        else {
            String output = "YES";
            while (queue.size() > 0) {
                char first = queue.pollFirst();
                char last = queue.pollLast();
                switch (first) {
                    case '{':
                        if (last != '}') output = "NO";
                        break;
                    case '[':
                        if (last != ']') output = "NO";
                        break;
                    case '(':
                        if (last != ')') output = "NO";
                        break;
                }
                if (output.equals("NO")) {
                    break;
                }
            }
            System.out.println(output);
        }
     }
}
