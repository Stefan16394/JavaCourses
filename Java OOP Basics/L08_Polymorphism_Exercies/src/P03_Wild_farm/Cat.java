package P03_Wild_farm;

import java.text.DecimalFormat;

public  class Cat extends Felime {
    private String breed;

    public Cat(String animalName, String animalType, double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }


    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eatFood(Food food) {
        this.setFoodEaten(food.getQuantity());
    }

    @Override
    public String toString() {
        DecimalFormat d=new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s, %s, %d]",this.getClass().getSimpleName(),this.getAnimalName(),
               this.breed,d.format(this.getAnimalWeight()), this.getLivingRegion(),this.getFoodEaten());
    }
}
