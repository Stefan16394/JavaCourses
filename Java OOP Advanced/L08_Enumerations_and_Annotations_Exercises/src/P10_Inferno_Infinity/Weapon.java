package P10_Inferno_Infinity;

import java.util.Comparator;

public class Weapon implements Comparable<Weapon> {
    private WeaponEnum weapon;
    private String name;
    private int strength;
    private int agility;
    private int vitality;


    public Weapon(WeaponEnum weapon,String name) {
        this.weapon = weapon;
        this.name=name;
        this.strength=0;
        this.agility=0;
        this.vitality=0;
    }

    public void calculateStats(Gems gem,Boolean empty)
    {
        if (empty)
        {
            this.strength+=gem.getStrength();
            this.agility+=gem.getAgility();
            this.vitality+=gem.getVitality();
        }
        else
        {
            this.strength-=gem.getStrength();
            this.agility-=gem.getAgility();
            this.vitality-=gem.getVitality();
        }

    }

    public WeaponEnum getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        int minDamage=this.weapon.getMinDamage()+strength*2+agility;
        int maxDamage=this.weapon.getMaxDamage()+strength*3+agility*4;
        return String.format("%s: %d-%d Damage, +%d Strength, +%d Agility, +%d Vitality",
        this.name,minDamage,maxDamage,this.strength,this.agility,this.vitality);
    }

    public double totalLevel()
    {
       return ((this.weapon.getMinDamage()+strength*2+agility+this.weapon.getMaxDamage()+strength*3+agility*4)/2.00)+strength+agility+vitality;
    }

    @Override
    public int compareTo(Weapon o) {
        double weapon1=this.totalLevel();
        double weapon2=o.totalLevel();

        int result=Double.compare(weapon1,weapon2);
        if (result<=0)
        {
            return -1;
        }
        return 1;
    }
}
