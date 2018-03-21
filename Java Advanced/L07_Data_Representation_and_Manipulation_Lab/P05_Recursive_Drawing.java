package L07_Data_Representation_and_Manipulation_Lab;

import java.util.Collections;
import java.util.Scanner;

public class P05_Recursive_Drawing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        draw(n);
    }
    private static void draw(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(String.join("",Collections.nCopies(n,"*")));
        draw(n-1);
        System.out.println(String.join("",Collections.nCopies(n,"#")));

    }

}
