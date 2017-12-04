package P01_Listerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] input=sc.nextLine().split("\\s+");
        List<String> strings=new ArrayList<>();
        for (int i=1;i<input.length;i++)
        {
            strings.add(input[i]);
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

            }
        }
    }
}
