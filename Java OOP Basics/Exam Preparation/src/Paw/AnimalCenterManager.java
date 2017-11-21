package Paw;

import java.util.*;

public class AnimalCenterManager {

    private static List<Center> adoptionCenters=new ArrayList<>();
    private static List<Center> cleansingCenters=new ArrayList<>();
    private static List<Center> castrationCenters=new ArrayList<>();

    private static List<Animal> adoptedAnimals=new ArrayList<>();
    private static List<Animal> cleansedAnimals=new ArrayList<>();
    private static List<Animal> castratedAnimals=new ArrayList<>();

    public static void registerCleansingCenter(String name)
    {
     Center cleansingCenter=new CleansingCenter(name);
     cleansingCenters.add(cleansingCenter);
    }

   public static void registerAdoptionCenter(String name)
   {
       Center adoptionCenter=new AdoptionCenter(name);
       adoptionCenters.add(adoptionCenter);
   }
   public static void registerCastrationCenter(String name)
   {
       Center castrationCenter=new CastrationCenter(name);
       castrationCenters.add(castrationCenter);
   }

   public static void registerDog(String name, int age, int learnedCommands, String adoptionCenterName)
   {
       Animal dog=new Dog(name,age,learnedCommands);
       dog.setOriginalCenter(adoptionCenterName);
       Center center=adoptionCenters.stream().filter(x->x.getName().equals(adoptionCenterName)).findFirst().get();
       center.getStoredAnimals().add(dog);
   }

   public static void registerCat(String name, int age, int intelligenceCoefficient, String adoptionCenterName)
   {
       Animal cat=new Cat(name,age,intelligenceCoefficient);
       cat.setOriginalCenter(adoptionCenterName);
       Center center=adoptionCenters.stream().filter(x->x.getName().equals(adoptionCenterName)).findFirst().get();
       center.getStoredAnimals().add(cat);
   }

   public static void sendForCleansing(String adoptionCenterName, String cleansingCenterName)
   {
    Center adoption=adoptionCenters.stream().filter(x->x.getName().equals(adoptionCenterName)).findFirst().get();
    Center cleansing=cleansingCenters.stream().filter(x->x.getName().equals(cleansingCenterName)).findFirst().get();
    for (int i=0;i<adoption.getStoredAnimals().size();)
    {
        Animal animal=adoption.getStoredAnimals().get(i);
        if (animal.getCleansingStatus().equals("UNCLEANSED"))
        {   cleansing.getStoredAnimals().add(animal);
            adoption.getStoredAnimals().remove(animal);
        }
        else
        {
            i++;
        }
    }
   }

   public static void sendForCastration(String adoptionCenterName,String castrationCenterName)
   {
       Center adoption=adoptionCenters.stream().filter(x->x.getName().equals(adoptionCenterName)).findFirst().get();
       Center castration=castrationCenters.stream().filter(x->x.getName().equals(castrationCenterName)).findFirst().get();

       for (int i=0;i<adoption.getStoredAnimals().size();)
       {
           Animal animal=adoption.getStoredAnimals().get(i);
           if (animal.getCleansingStatus().equals("UNCLEANSED"))
           {
               castration.getStoredAnimals().add(animal);
               adoption.getStoredAnimals().remove(animal);
           }
           else
           {
               i++;
           }
       }
   }

   public static void cleanse(String cleansingCenterName)
   {
       Center cleansing=cleansingCenters.stream().filter(x->x.getName().equals(cleansingCenterName)).findFirst().get();
       for (int i=0;i<cleansing.getStoredAnimals().size();i++)
       {
           Animal animal=cleansing.getStoredAnimals().get(i);
           animal.setCleansingStatus();
           cleansedAnimals.add(animal);
           String center=animal.getOriginalCenter();
           for (int j=0;j<adoptionCenters.size();j++)
           {
               if (adoptionCenters.get(j).getName().equals(center))
               {
                   adoptionCenters.get(j).getStoredAnimals().add(animal);
                   break;
               }
           }
       }
       cleansing.setStoredAnimals(new ArrayList<>());
   }

   public static void castrate(String castrationCenterName)
   {
       Center castration=castrationCenters.stream().filter(x->x.getName().equals(castrationCenterName)).findFirst().get();

       for (Animal animal:castration.getStoredAnimals())
           {
           castratedAnimals.add(animal);
           String center=animal.getOriginalCenter();
           Center adoption=adoptionCenters.stream().filter(x->x.getName().equals(center)).findFirst().get();
           adoption.getStoredAnimals().add(animal);

       }
       castration.setStoredAnimals(new ArrayList<>());
   }


   public static void adopt(String adoptionCenterName)
   {
       Center center=adoptionCenters.stream().filter(x->x.getName().equals(adoptionCenterName)).findFirst().get();
       for (int i=0;i<center.getStoredAnimals().size();)
       {
           Animal animal=center.getStoredAnimals().get(i);
           if (animal.getCleansingStatus().equals("CLEANSED"))
           {   adoptedAnimals.add(animal);
               center.getStoredAnimals().remove(i);
           }
           else
           {
               i++;
           }
       }
   }

   public static void printStatistics()
   {
       StringBuilder sb=new StringBuilder();
       sb.append("Paw Incorporative Regular Statistics\n");
       sb.append("Adoption Centers: ").append(adoptionCenters.size()).append("\n");
       sb.append("Cleansing Centers: ").append(cleansingCenters.size()).append("\n");
       sb.append("Adopted Animals: ");
       List<String> s=new ArrayList<>();
       adoptedAnimals.stream().sorted(Comparator.comparing(Animal::getName)).forEach(x->{
           s.add(x.getName());
       });
       if (s.size()==0)
       {
           sb.append("None").append("\n");
       }
       else
       {
           sb.append(String.join(", ",s));
           sb.append("\n");
       }
       sb.append("Cleansed Animals: ");
       List<String> y=new ArrayList<>();
       cleansedAnimals.stream().sorted(Comparator.comparing(Animal::getName)).forEach(x->{
           y.add(x.getName());
       });
       if (y.size()==0)
       {
           sb.append("None").append("\n");
       }
       else
       {
           sb.append(String.join(", ",y));
           sb.append("\n");

       }
       int sum=0;
       for (Center center:adoptionCenters)
       {
           List<Animal> animals=center.getStoredAnimals();
           for (Animal animal:animals)
           {
               if (animal.getCleansingStatus().equals("CLEANSED"))
               {
                   sum++;
               }
           }
       }

       sb.append("Animals Awaiting Adoption: ").append(sum).append("\n");
       sum=0;
       for (Center center:cleansingCenters)
       {

         sum+=center.getStoredAnimals().size();
       }
       sb.append("Animals Awaiting Cleansing: ").append(sum).append("\n");
       System.out.println(sb.toString());

   }

   public static void castrationStatistics()
   {
       StringBuilder sb=new StringBuilder();
       sb.append("Paw Inc. Regular Castration Statistics\n");
       sb.append("Castration Centers: ").append(castrationCenters.size()).append("\n");
       sb.append("Castrated Animals: ");
       if (castratedAnimals.size()==0)
       {
           sb.append("None");
       }
       castratedAnimals.sort(Comparator.comparing(Animal::getName));
       List<String> x=new ArrayList<>();
       castratedAnimals.forEach(y->{
           x.add(y.getName());
       });
       sb.append(String.join(", ",x));
       System.out.println(sb.toString());
   }

}
