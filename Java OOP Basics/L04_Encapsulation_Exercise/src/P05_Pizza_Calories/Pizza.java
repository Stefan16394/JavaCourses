package P05_Pizza_Calories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Toppings> toppings;

    public void setName(String name) {
        if (name.trim().isEmpty() || name.length()>15)
        {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name=name;
    }

    public Pizza(String name, Dough dough) {
        this.name = name;
        this.dough = dough;
        this.toppings = new ArrayList<>();
    }

    public Pizza() {
    }

    public void addTopping(Toppings toppings)
    {
        this.toppings.add(toppings);
    }

    public double calories()
    {
        double calories=1;
        switch (dough.getFlourType())
        {
            case "White":
                calories*=1.5;
                break;
            case "Wholegrain":
                calories*=1.0;
                break;
        }
        switch (dough.getBackingTehnique())
        {
            case "Crispy":
                calories*=0.9;
                break;
            case "Chewy":
                calories*=1.1;
                break;
            case "Homemade":
                calories*=1.0;
                break;
        }
        calories*=2*dough.getWeight();
        for(Toppings toppings:toppings)
        {
            switch (toppings.getType())
            {
                case "Meat":
                    calories+=1.2*toppings.getWeight()*2;
                    break;
                case "Veggies":
                    calories+=0.8*toppings.getWeight()*2;
                    break;
                case "Cheese":
                    calories+=1.1*toppings.getWeight()*2;
                    break;
                case "Sauce":
                    calories+=0.9*toppings.getWeight()*2;
                    break;
            }

        }
        return calories;
    }

    public String getName() {
        return name;
    }
}
