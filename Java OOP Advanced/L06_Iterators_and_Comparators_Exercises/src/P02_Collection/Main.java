package P02_Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] input=sc.nextLine().split("\\s+");
        String[] strings=new String[input.length-1];
        for (int i=1;i<input.length;i++)
        {
            strings[i-1]=input[i];
        }
        Listerator listerator=new Listerator(strings);

        while (true)
        {
            input=sc.nextLine().split("\\s+");
            if (input[0].equals("END"))
            {
                break;
            }
            switch (input[0])
            {
                case "Move":
                    System.out.println(listerator.move());
                    break;
                case "HasNext":
                    System.out.println(listerator.hasNext());
                    break;
                case "Print":
                    try {
                        listerator.print();
                    }
                    catch (IllegalArgumentException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "PrintAll":
                    listerator.printAll();
                    System.out.println();
                    break;
            }
        }
    }
}
