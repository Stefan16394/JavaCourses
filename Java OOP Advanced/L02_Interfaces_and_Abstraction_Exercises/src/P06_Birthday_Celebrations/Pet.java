package P06_Birthday_Celebrations;

 class Pet implements IDGetter {
    private String name;
    private String birthday;

     Pet(String name, String birthday) {
        this.name = name;
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
