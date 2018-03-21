package P03_Mankind;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] input=sc.nextLine().split("\\s+");
        try {
            Student student=new Student(input[0],input[1],input[2]);
            System.out.println(student.toString());

        }
        catch (IllegalArgumentException e)
        {
            System.out.print(e.getMessage());
            return;
        }
        input=sc.nextLine().split("\\s+");
        try {
            Worker worker=new Worker(input[0],input[1],Double.valueOf(input[2]),Double.valueOf(input[3]));
            System.out.print(worker.toString());
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
