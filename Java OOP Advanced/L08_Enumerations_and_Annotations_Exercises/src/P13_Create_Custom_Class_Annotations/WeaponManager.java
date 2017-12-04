package P13_Create_Custom_Class_Annotations;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class WeaponManager {
    private Map<String, Weapon> weaponMap=new LinkedHashMap<>();

    public void create(WeaponEnum weaponEnum, String name)
    {
        Weapon weapon=new Weapon(weaponEnum,name);
        weaponMap.put(name,weapon);
    }

    public void add(String name, int socketIndex, Gems gem)
    {
        Weapon weapon=weaponMap.get(name);
        Gems[] gems=weapon.getWeapon().getSockets();
        if (socketIndex>=0 && socketIndex<gems.length)
        {
            gems[socketIndex]=gem;
            weapon.calculateStats(gem,true);
        }

    }

    public void remove(String name,int socketIndex)
    {
        Weapon weapon=weaponMap.get(name);
        Gems[] gems=weapon.getWeapon().getSockets();

        if (socketIndex>=0 && socketIndex<gems.length && gems[socketIndex]!=null)
        {
            weapon.calculateStats(gems[socketIndex],false);
            gems[socketIndex]=null;
        }
    }

    public void print(String name)
    {
        Weapon weapon=weaponMap.get(name);
        System.out.println(weapon.toString());
    }

    public void printCompare(String weapon1,String weapon2)
    {
        Weapon wp1=weaponMap.get(weapon1);
        Weapon wp2=weaponMap.get(weapon2);
        if (wp1.compareTo(wp2)<=0)
        {
            System.out.println(wp2.toString()+ String.format(" (Item Level: %.1f)",wp2.totalLevel() ));
        }
        else
        {
            System.out.println(wp1.toString()+String.format(" (Item Level: %.1f)",wp1.totalLevel()));
        }

    }

    public void anotationPrint(String type)
    {
        Class<?> clas=Weapon.class;
        switch (type)
        {
            case "Author":
                System.out.println("Author: "+clas.getAnnotation(IAnnotation.class).Author());
                break;
            case "Revision":
                System.out.println("Revision: "+clas.getAnnotation(IAnnotation.class).Revision());
                break;
            case "Description":
                System.out.println("Class description: "+clas.getAnnotation(IAnnotation.class).Description());
                break;
            case "Reviewers":
                System.out.println("Reviewers: "+clas.getAnnotation(IAnnotation.class).Reviewers());
                break;
        }

    }


    public Map<String, Weapon> getWeaponMap() {
        return Collections.unmodifiableMap(this.weaponMap);
    }
}
