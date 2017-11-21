package P05_Pizza_Calories;

public class Toppings {
    private String type;
    private int weight;

    public Toppings(String type, int weight) {
        setType(type);
        setWeight(weight,type);
    }

    private void setType(String type) {
        if (!type.equals("Meat") && !type.equals("Veggies") && !type.equals("Cheese") && !type.equals("Sauce"))
        {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.",type));
        }
        this.type = type;
    }

    private void setWeight(int weight,String type) {
        if (weight<1 || weight>50)
        {
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].",type));
        }
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }
}
