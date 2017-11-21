package L11_Functional_Programing_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class P03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] text=sc.nextLine().split(" ");
        Predicate<String> count=a->a.charAt(0)==a.toUpperCase().charAt(0);
        int counter=0;
        List<String> result=new ArrayList<>();
        for(int i=0;i<text.length;i++)
        {
            if(count.test(text[i]))
            {
                counter++;
                result.add(text[i]);
            }
        }
        System.out.println(counter);
        System.out.println(String.join("\n",result));
    }
}
