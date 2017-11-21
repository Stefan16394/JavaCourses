package P05_Pizza_Calories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] input=sc.nextLine().split("\\s+");

        if (input[0].equals("Pizza"))
        {
            String pizzaName=input[1];
          Pizza pizza=new Pizza();
          try {
              pizza.setName(input[1]);
          }
          catch (IllegalArgumentException e)
          {
              System.out.println(e.getMessage());
              return;
          }
          int n=Integer.parseInt(input[2]);
          if (n<0 || n>10)
          {
              System.out.println("Number of toppings should be in range [0..10].");
              return;
          }

          input=sc.nextLine().split("\\s+");
        try {
            Dough dough=new Dough(input[1],input[2],Integer.parseInt(input[3]));
            pizza=new Pizza(pizzaName,dough);
            for (int i=0;i<n;i++)
            {
                input=sc.nextLine().split("\\s+");
                if (input[0].equals("END"))
                {
                    break;
                }
               try {
                   Toppings toppings=new Toppings(input[1],Integer.parseInt(input[2]));
                   pizza.addTopping(toppings);
               }
               catch (IllegalArgumentException e)
               {
                   System.out.println(e.getMessage());
                   return;
               }
            }
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
            return;
        }
            System.out.printf("%s - %.2f\n",pizza.getName(),pizza.calories());
        }
        else if (input[0].equals("Dough"))
        {
          try {
              Dough dough=new Dough(input[1],input[2],Integer.parseInt(input[3]));

          }
          catch (IllegalArgumentException e)
          {
              System.out.println(e.getMessage());
          }

        }
        else if (input[0].equals("Topping"))
        {
            try {
                Toppings toppings=new Toppings(input[1],Integer.parseInt(input[2]));
            }
            catch (IllegalArgumentException e)
            {
                System.out.println(e.getMessage());

            }
        }
    }
}
