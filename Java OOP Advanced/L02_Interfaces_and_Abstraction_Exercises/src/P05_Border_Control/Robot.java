package P05_Border_Control;

public class Robot implements IDGetter {
   private String model;
   private String id;

    public Robot(String model, String id) {
        this.model = model;
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
