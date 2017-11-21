package Paw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Center {
    private String name;
    private List<Animal> storedAnimals;

    //this took 5 points
    protected Center(String name) {
        this.name = name;
        this.storedAnimals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Animal> getStoredAnimals() {
        return storedAnimals;
    }

    public void setStoredAnimals(List<Animal> storedAnimals) {
        this.storedAnimals = storedAnimals;
    }

}
