package tests;

import hell.entities.miscellaneous.HeroInventory;
import hell.interfaces.Inventory;
import hell.interfaces.Item;
import hell.interfaces.Recipe;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Testthis {
   private Inventory inventory=new HeroInventory();
   private Item mocked=Mockito.mock(Item.class);
   private Item mocked1=Mockito.mock(Item.class);

   @Test
    public void getTotalStrengthBonusTest() throws NoSuchFieldException, IllegalAccessException {
      Field field=this.inventory.getClass().getDeclaredField("commonItems");
      field.setAccessible(true);
      Map<String, Item> commonItems =(Map<String, Item>) field.get(this.inventory);

       Mockito.when(mocked.getName()).thenReturn("1");
       Mockito.when(mocked.getStrengthBonus()).thenReturn(2);
       Mockito.when(mocked1.getName()).thenReturn("2");
       Mockito.when(mocked1.getStrengthBonus()).thenReturn(2);

       commonItems.put("1",mocked);
       commonItems.put("2",mocked1);
      Assert.assertEquals("Wrong answer",4,inventory.getTotalStrengthBonus());
   }

   @Test
   public void getTotalAgilityBonusTest() throws NoSuchFieldException, IllegalAccessException {
      Field field=this.inventory.getClass().getDeclaredField("commonItems");
      field.setAccessible(true);
      Map<String, Item> commonItems =(Map<String, Item>) field.get(this.inventory);

      Mockito.when(mocked.getName()).thenReturn("1");
      Mockito.when(mocked.getAgilityBonus()).thenReturn(2);
      Mockito.when(mocked1.getName()).thenReturn("2");
      Mockito.when(mocked1.getAgilityBonus()).thenReturn(2);

      commonItems.put("1",mocked);
      commonItems.put("2",mocked1);
      Assert.assertEquals("Wrong answer",4,inventory.getTotalAgilityBonus());
   }

   @Test
   public void getTotalIntelligenceBonusTest() throws NoSuchFieldException, IllegalAccessException {
      Field field=this.inventory.getClass().getDeclaredField("commonItems");
      field.setAccessible(true);
      Map<String, Item> commonItems =(Map<String, Item>) field.get(this.inventory);

      Mockito.when(mocked.getName()).thenReturn("1");
      Mockito.when(mocked.getIntelligenceBonus()).thenReturn(2);
      Mockito.when(mocked1.getName()).thenReturn("2");
      Mockito.when(mocked1.getIntelligenceBonus()).thenReturn(2);

      commonItems.put("1",mocked);
      commonItems.put("2",mocked1);
      Assert.assertEquals("Wrong answer",4,inventory.getTotalIntelligenceBonus());
   }

   @Test
   public void getTotalHitPointsBonusTest() throws NoSuchFieldException, IllegalAccessException {
      Field field=this.inventory.getClass().getDeclaredField("commonItems");
      field.setAccessible(true);
      Map<String, Item> commonItems =(Map<String, Item>) field.get(this.inventory);

      Mockito.when(mocked.getName()).thenReturn("1");
      Mockito.when(mocked.getHitPointsBonus()).thenReturn(2);
      Mockito.when(mocked1.getName()).thenReturn("2");
      Mockito.when(mocked1.getHitPointsBonus()).thenReturn(2);

      commonItems.put("1",mocked);
      commonItems.put("2",mocked1);
      Assert.assertEquals("Wrong answer",4,inventory.getTotalHitPointsBonus());
   }

   @Test
   public void getTotalDamageBonusTest() throws NoSuchFieldException, IllegalAccessException {
      Field field=this.inventory.getClass().getDeclaredField("commonItems");
      field.setAccessible(true);
      Map<String, Item> commonItems =(Map<String, Item>) field.get(this.inventory);

      Mockito.when(mocked.getName()).thenReturn("1");
      Mockito.when(mocked.getDamageBonus()).thenReturn(2);
      Mockito.when(mocked1.getName()).thenReturn("2");
      Mockito.when(mocked1.getDamageBonus()).thenReturn(2);

      commonItems.put("1",mocked);
      commonItems.put("2",mocked1);
      Assert.assertEquals("Wrong answer",4,inventory.getTotalDamageBonus());
   }

   @Test
   public void addRecipeItemTest() throws NoSuchFieldException, IllegalAccessException {
      Recipe recipeItem=Mockito.mock(Recipe.class);
      Mockito.when(recipeItem.getName()).thenReturn("1");
      this.inventory.addRecipeItem(recipeItem);

      Field field=this.inventory.getClass().getDeclaredField("recipeItems");
      field.setAccessible(true);
      Map<String,Recipe> map=(Map<String,Recipe>) field.get(this.inventory);


      Assert.assertEquals("Wrong asnwer",1,map.size());
   }

   @Test
   public void s() throws NoSuchFieldException, IllegalAccessException {
      Recipe recipeItem=Mockito.mock(Recipe.class);
      Mockito.when(recipeItem.getName()).thenReturn("1");
      List<String> requiredItems=new ArrayList<>();
      requiredItems.add("Stefko");
      requiredItems.add("Stevica");
      Mockito.when(recipeItem.getRequiredItems()).thenReturn(requiredItems);
      this.inventory.addRecipeItem(recipeItem);

      Field field1=this.inventory.getClass().getDeclaredField("recipeItems");
      field1.setAccessible(true);
      Map<String,Recipe> map=(Map<String,Recipe>) field1.get(this.inventory);


      Mockito.when(mocked.getName()).thenReturn("Stefko");
      Mockito.when(mocked1.getName()).thenReturn("Stevica");
      this.inventory.addCommonItem(mocked);
      this.inventory.addCommonItem(mocked1);

      Field field=this.inventory.getClass().getDeclaredField("commonItems");
      field.setAccessible(true);
      Map<String, Item> commonItems =(Map<String, Item>) field.get(this.inventory);


      Assert.assertEquals("Wrong asnwer",1,commonItems.size());
   }

}
