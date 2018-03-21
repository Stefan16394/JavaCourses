package hell;

import hell.Models.Heroes.Assassin;
import hell.Models.Heroes.Barbarian;
import hell.Models.Heroes.Wizard;
import hell.Models.Items.CommonItem;
import hell.Models.Items.RecipeItem;
import hell.entities.miscellaneous.HeroInventory;
import hell.interfaces.Hero;
import hell.interfaces.ICommand;
import hell.interfaces.Item;
import hell.interfaces.Recipe;

import java.time.LocalTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Controller {
    private Map<String,Hero> heroes=new LinkedHashMap<>();

    public Controller() {
        this.heroes = new LinkedHashMap<>();
    }

    public Map<String, Hero> getHeroes() {
        return this.heroes;
    }

   public void createHero(String name,String type)
   {
       Hero hero=null;
       switch (type)
       {
           case "Assassin":
                hero=new Assassin(name,new HeroInventory());
                break;
           case "Barbarian":
               hero=new Barbarian(name,new HeroInventory());
               break;
           case "Wizard":
               hero=new Wizard(name,new HeroInventory());
               break;
       }
       this.heroes.put(name,hero);
       System.out.println(String.format("Created %s - %s",type,name));
   }

   public void createItem(String name,String heroName,int strenthBonus,int agilityBonus,int intelligenceBonus,
                          int hitPointsBonus,int damageBonus)
   {
       Item commonItem =new CommonItem(name,strenthBonus,agilityBonus,intelligenceBonus,hitPointsBonus,damageBonus);
       this.heroes.get(heroName).addItem(commonItem);
       System.out.println(String.format("Added item - %s to Hero - %s",name,heroName));
   }

   public void createRecipe(String name,String heroName,int strenthBonus,int agilityBonus,int intelligenceBonus,
                            int hitPointsBonus,int damageBonus,List<String> requiredItems)
   {
       Recipe recipeItem =new RecipeItem(name,strenthBonus,agilityBonus,intelligenceBonus,hitPointsBonus,
               damageBonus,requiredItems);
       this.heroes.get(heroName).addRecipe(recipeItem);
       System.out.println(String.format("Added recipe - %s to Hero - %s",name,heroName));
   }

   public void inspect(String heroName) throws NoSuchFieldException, IllegalAccessException {
       Hero hero=this.heroes.get(heroName);
       String output=hero.toString();
       StringBuilder sb=new StringBuilder(output);
       if (hero.getItems().size()==0)
       {
           sb.append("None\n");
       }
       else
       {    sb.append("\n");
           for (Item item:hero.getItems())
           {
             sb.append(String.format("###Item: %s\n",item.getName()));
               sb.append(String.format("###+%d Strength\n",item.getStrengthBonus()));
               sb.append(String.format("###+%d Agility\n",item.getAgilityBonus()));
               sb.append(String.format("###+%d Intelligence\n",item.getIntelligenceBonus()));
               sb.append(String.format("###+%d HitPoints\n",item.getHitPointsBonus()));
               sb.append(String.format("###+%d Damage\n",item.getDamageBonus()));
           }
       }
       System.out.print(sb.toString());
   }

   public void quit() throws NoSuchFieldException, IllegalAccessException {
        heroes=this.heroes.entrySet().stream().sorted((a,b)->{
            long firstHero=a.getValue().getStrength()+a.getValue().getAgility()+a.getValue().getIntelligence();
            long secondHero=b.getValue().getStrength()+b.getValue().getAgility()+b.getValue().getIntelligence();
            int result=Long.compare(secondHero,firstHero);
            if (result!=0)
            {
                return result;
            }
            long a1=a.getValue().getDamage()+a.getValue().getStrength();
            long b2=b.getValue().getDamage()+b.getValue().getStrength();
            return Long.compare(b2,a1);
        }). collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

       String sb="";
       int counter = 0;
       for (Hero hero : this.heroes.values()) {
            sb = String.format("%d. %s: %s%s", ++counter, hero.getClass().getSimpleName(), hero.getName(), System.lineSeparator()) +
                   String.format("###HitPoints: %d%s", hero.getHitPoints(), System.lineSeparator()) +
                   String.format("###Damage: %d%s", hero.getDamage(), System.lineSeparator()) +
                   String.format("###Strength: %d%s", hero.getStrength(), System.lineSeparator()) +
                   String.format("###Agility: %d%s", hero.getAgility(), System.lineSeparator()) +
                   String.format("###Intelligence: %d%s", hero.getIntelligence(), System.lineSeparator()) +
                   String.format("###Items: %s", hero.getItems().size() == 0 ? "None" : String.join(", ", hero.getItems().stream().map(Item::getName).collect(Collectors.toList())));
           System.out.println(sb);
       }
   }
}
