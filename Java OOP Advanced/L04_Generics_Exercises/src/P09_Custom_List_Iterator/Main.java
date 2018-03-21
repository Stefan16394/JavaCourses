package P09_Custom_List_Iterator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CustomList customList=new CustomList();
        while (true)
        {
            String input=sc.nextLine();
            if (input.equals("END"))
            {
                break;
            }
            String[] commands=input.split(" ");
            switch (commands[0])
            {
                case "Add":
                    customList.add(commands[1]);
                    break;
                case "Remove":
                   customList.remove(Integer.valueOf(commands[1]));
                    break;
                case "Contains":
                    System.out.println(customList.contains(commands[1]));
                    break;
                case "Swap":
                    customList.swap(Integer.valueOf(commands[1]),Integer.valueOf(commands[2]));
                    break;
                case "Greater":
                    System.out.println(customList.countGreaterThan(commands[1]));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    customList.print();
                    break;
                case "Sort":
                    customList.sort();
                    break;
            }
        }
    }
}
