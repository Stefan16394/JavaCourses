package P07_Food_Shortage;

class Robot implements IDGetter {
  private String model;
  private String id;

    Robot(String model, String id) {
       this.model = model;
       this.id = id;
   }

   @Override
   public String getId(String fakeId) {
       if (this.id.endsWith(fakeId))
       {
           return this.id+"\n";
       }
       return "";
   }
}
