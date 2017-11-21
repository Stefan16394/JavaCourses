package P03_Wild_farm;

import P03_Wild_farm.Food;

import java.text.DecimalFormat;

public class Animal {
    private String animalName;
    private String animalType;
    private double animalWeight;
    private int foodEaten=0;

    public Animal(String animalName, String animalType, double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
    }

    public Animal() {
    }

    public void setFoodEaten(int foodEaten) {
        this.foodEaten +=foodEaten;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public double getAnimalWeight() {
        return animalWeight;
    }

    public int getFoodEaten() {
        return foodEaten;
    }


    public void makeSound(){

    }
    public void eatFood(Food food){

    }

}
