package P03_Wild_farm;

import java.text.DecimalFormat;

public  class Tiger extends Felime {

    public Tiger(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eatFood(Food food) {
         Food food1=food;

        if (food1.getClass().getSimpleName().equals("Meat"))
        {
            this.setFoodEaten(food.getQuantity());
        }
        else
        {
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
    }


}
