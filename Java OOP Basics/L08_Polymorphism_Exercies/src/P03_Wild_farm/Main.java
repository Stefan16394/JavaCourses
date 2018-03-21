package P03_Wild_farm;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Animal> list=new ArrayList<>();

        while (true) {

            String[] input = sc.nextLine().split(" ");
            if (input[0].equals("End")) {
                break;
            }
            String animalType = input[0];
            String animalName = input[1];
            double animalWeight = Double.parseDouble(input[2]);
            String animalLivingRegion = input[3];

            Animal animal=new Animal();
            String[] food = sc.nextLine().split(" ");
                switch (animalType) {
                    case "Mouse":
                        animal = new Mouse(animalName, animalType, animalWeight, animalLivingRegion);
                        break;
                    case "Zebra":
                         animal = new Zebra(animalName, animalType, animalWeight, animalLivingRegion);
                       break;
                    case "Tiger":
                        animal = new Tiger(animalName, animalType, animalWeight, animalLivingRegion);
                        break;
                    case "Cat":
                        animal=new Cat(animalName,animalType,animalWeight,animalLivingRegion,input[4]);
                        break;
                }
                Food food1=null;
                       switch (food[0]){
                       case "Vegetable":
                           food1= new Vegetable(Integer.valueOf(food[1]));
                           break;
                       case "Meat":
                          food1= new Meat(Integer.valueOf(food[1]));
                          break;
                          default:break;
                   }

            animal.makeSound();
            try {

                animal.eatFood(food1);
            }
            catch (IllegalArgumentException e)
            {
                System.out.println(e.getMessage());
            }
            list.add(animal);


        }
            for (Animal animal:list)
            {
                System.out.println(animal.toString());
            }


        }

}
