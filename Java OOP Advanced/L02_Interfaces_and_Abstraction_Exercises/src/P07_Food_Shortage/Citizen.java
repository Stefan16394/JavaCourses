package P07_Food_Shortage;

class Citizen implements IDGetter,Buyer {
   private String name;
   private int age;
   private String id;
   private String birthday;
   private int food;

     Citizen(String name, int age, String id, String birthday) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthday = birthday;
        this.food=0;
    }

    @Override
   public String getId(String fakeId) {
       if (this.birthday.endsWith(fakeId))
       {
           return this.birthday+"\n";
       }
       return "";
   }

    @Override
    public void buyFood() {
        this.food+=10;
    }

    @Override
    public int getFood() {
        return this.food;
    }

    public String getName() {
        return this.name;
    }
}
