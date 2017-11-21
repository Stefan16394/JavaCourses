package P06_Birthday_Celebrations;

 class Citizen implements IDGetter {
    private String name;
    private int age;
    private String id;
    private String birthday;


      Citizen(String name, int age, String id, String birthday) {
         this.name = name;
         this.age = age;
         this.id = id;
         this.birthday = birthday;
     }

     @Override
    public String getId(String fakeId) {
        if (this.birthday.endsWith(fakeId))
        {
            return this.birthday+"\n";
        }
        return "";
    }
}
