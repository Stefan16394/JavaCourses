package hell.Models.Heroes;

import hell.interfaces.Hero;
import hell.interfaces.Inventory;
import hell.interfaces.Item;
import hell.interfaces.Recipe;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public abstract class BaseHero implements Hero {
    private String name;
    private int strength;
    private int agility;
    private int intelligence;
    private int hitPoints;
    private int damage;
    private Inventory inventory;

    protected BaseHero(String name, int strength, int agility, int intelligence, int hitPoints, int damage, Inventory inventory) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.inventory = inventory;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public long getStrength() {
        return this.strength;
    }

    @Override
    public long getAgility() {
        return this.agility;
    }

    @Override
    public long getIntelligence() {
        return this.intelligence;
    }

    @Override
    public long getHitPoints() {
        return this.hitPoints;
    }

    @Override
    public long getDamage() {
        return this.damage;
    }

    @Override
    public Collection<Item> getItems() throws NoSuchFieldException, IllegalAccessException {
        Field field =this.inventory.getClass().getDeclaredField("commonItems");
        field.setAccessible(true);
        Map<String, Item> items=(Map<String, Item>) field.get(this.inventory);
        return items.values();
    }

    @Override
    public void addItem(Item item) {
       this.inventory.addCommonItem(item);
    }

    @Override
    public void addRecipe(Recipe recipe) {
       this.inventory.addRecipeItem(recipe);
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(String.format("Hero: %s, Class: %s\n",this.name,this.getClass().getSimpleName()));
        sb.append(String.format("HitPoints: %d, Damage: %d\n",this.hitPoints+this.inventory.getTotalHitPointsBonus(),this.damage+
        this.inventory.getTotalDamageBonus()));
        sb.append(String.format("Strength: %d\n",this.strength+this.inventory.getTotalStrengthBonus()));
        sb.append(String.format("Agility: %d\n",this.agility+this.inventory.getTotalAgilityBonus()));
        sb.append(String.format("Intelligence: %d\n",this.intelligence+this.inventory.getTotalIntelligenceBonus()));
        sb.append("Items: ");
        return sb.toString();
    }
}
