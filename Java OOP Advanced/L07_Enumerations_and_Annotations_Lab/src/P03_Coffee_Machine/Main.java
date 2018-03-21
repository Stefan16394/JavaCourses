package P03_Coffee_Machine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CoffeeMachine machine=new CoffeeMachine();
        while (true)
        {
            String[] input=sc.nextLine().split(" ");
            if (input[0].equals("END"))
            {
                break;
            }
             try {
                machine.insertCoin(input[0]);
              }
              catch (IllegalArgumentException e)
              {
                  machine.buyCoffee(input[0].toUpperCase(),input[1].toUpperCase());
              }

        }
        for (Coffee coffee:machine.coffeesSold())
        {
            System.out.println(coffee.toString());
        }
    }
}
