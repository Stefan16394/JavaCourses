package hell.Models.Heroes;

import hell.interfaces.Inventory;

public class Wizard extends BaseHero {
    private static final int BASE_STRENGTH=25;
    private static final int BASE_AGILITY=25;
    private static final int BASE_INTELLIGENCE=100;
    private static final int BASE_HITPOINTS=100;
    private static final int BASE_DAMAGE=250;

    public Wizard(String name, Inventory inventory) {
        super(name, BASE_STRENGTH, BASE_AGILITY, BASE_INTELLIGENCE, BASE_HITPOINTS, BASE_DAMAGE, inventory);
    }

}
