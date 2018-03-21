package P05_Generic_Count_Method_String;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.valueOf(sc.nextLine());
        Box box=new Box();

        for (int i=0;i<n;i++)
        {
            box.getValues().add(sc.nextLine());
        }
        String value=sc.nextLine();
        System.out.println(box.compare(value));
    }
}
