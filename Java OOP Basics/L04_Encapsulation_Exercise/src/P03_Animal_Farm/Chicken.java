package P03_Animal_Farm;

public class Chicken {
    private String name;
    private int age;

   public Chicken(String name,int age)
   {
      setName(name);
       setAge(age);
   }

    public void setName(String name) {
        if (name.length()<1 || name.charAt(0)==' ')
        {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        else {

            this.name=name;
        }
    }

    public void setAge(int age) {
       if (age>=0 && age<16)
       {
           this.age = age;
       }
       else {
           throw new IllegalArgumentException("Age should be between 0 and 15.");
       }
    }

    public String productPerDay()
    {
     if (age>=0 & age<6)
     {
         return "2";
     }
     else if (age>=6 & age<12)
     {
         return "1";
     }
     else
     {
         return "0.75";
     }
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
