package P05_Border_Control;

public class Citizen implements IDGetter{
    private String name;
    private int age;
    private String id;


    public Citizen(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }


    @Override
    public String getId() {
        return this.id;
    }
}
