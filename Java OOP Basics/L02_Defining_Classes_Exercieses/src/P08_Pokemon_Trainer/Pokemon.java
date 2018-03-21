package P08_Pokemon_Trainer;

public class Pokemon {
    private String name;
    private String element;
    private int healht;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public int getHealht() {
        return healht;
    }

    public void setHealht(int healht) {
        this.healht = healht;
    }

    public void dropHP()
    {
        this.healht-=10;
    }

    public Pokemon(String name, String element, int healht) {
        this.name = name;
        this.element = element;
        this.healht = healht;
    }
}
