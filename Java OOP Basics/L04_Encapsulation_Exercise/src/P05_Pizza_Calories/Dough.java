package P05_Pizza_Calories;

public class Dough {
    private String flourType;
    private String backingTehnique;
    private int weight;

    public Dough(String flourType, String backingTehnique, int weight) {
        setFlourType(flourType);
        setBackingTehnique(backingTehnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if (!flourType.equals("White") && !flourType.equals("Wholegrain"))
        {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType=flourType;
    }

    private void setBackingTehnique(String backingTehnique) {
        if (!backingTehnique.equals("Crispy") && !backingTehnique.equals("Chewy") && !backingTehnique.equals("Homemade"))
        {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.backingTehnique = backingTehnique;
    }

    private void setWeight(int weight) {
        if(weight<1 || weight>200)
        {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public String getFlourType() {
        return flourType;
    }

    public String getBackingTehnique() {
        return backingTehnique;
    }

    public int getWeight() {
        return weight;
    }
}
