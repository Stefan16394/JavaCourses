package P04_Shopping_Spree;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedHashMap<String,Person> list=new LinkedHashMap<>();
        LinkedHashMap<String,Product> list1=new LinkedHashMap<>();
        String[] persons=sc.nextLine().split(";");
        for (String person:persons)
        {
            String name=person.split("=")[0];
            double money=Double.valueOf(person.split("=")[1]);
           try {
               Person person1=new Person(name,money);
               list.put(name,person1);
           }
           catch (IllegalArgumentException e)
           {
               System.out.println(e.getMessage());
           }

        }
        String[] products=sc.nextLine().split(";");
        for (String product:products)
        {
            String productName=product.split("=")[0];
            double cost=Double.valueOf(product.split("=")[1]);
            try {
                Product product1=new Product(productName,cost);
                list1.put(productName,product1);
            }
            catch (IllegalArgumentException e)
            {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            String[] input = sc.nextLine().split(" ");
            if (input[0].equals("END")) {
                break;
            }
            String person = input[0];
            String product = input[1];
            Person person1 = list.get(person);
            Product product1 = list1.get(product);
            if (list.containsKey(person) && list1.containsKey(product)) {
                if (person1.getMoney() >= product1.getCost()) {
                    person1.buyThis(product1.getCost(), product);
                    System.out.println(person + " bought " + product);
                } else {
                    System.out.println(person + " can't afford " + product);
                }

            }
        }
        list.values().forEach(System.out::println);
    }
}
