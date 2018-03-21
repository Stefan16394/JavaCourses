package P03_Wild_farm;

import java.text.DecimalFormat;

public  class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat d=new DecimalFormat("#.##");

        return String.format("%s[%s, %s, %s, %d]",this.getClass().getSimpleName(),this.getAnimalName(),
                d.format(this.getAnimalWeight()),this.livingRegion,this.getFoodEaten());
    }
}
