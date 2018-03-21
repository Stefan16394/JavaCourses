package P04_Mordors_Cruelty_Plan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] food=sc.nextLine().split("\\s+");
        Gandalf gandalf=new Gandalf();
        for (String dish:food)
        {
            gandalf.eatFood(dish);
        }
        System.out.println(gandalf.toString());
    }
}
