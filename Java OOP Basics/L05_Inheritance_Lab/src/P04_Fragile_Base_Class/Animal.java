package P04_Fragile_Base_Class;

import java.util.List;

public class Animal {
    protected List<Food> foodEaten;

    public Animal(List<Food> foodEaten) {
        this.foodEaten = foodEaten;
    }

    public final void eat(Food food){
       this.foodEaten.add(food);
    }

    public void eatAll(Food[] foods){
     for(Food food:foods)
     {
         this.foodEaten.add(food);
     }
    }
}
