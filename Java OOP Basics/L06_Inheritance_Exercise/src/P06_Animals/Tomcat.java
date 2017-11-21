package P06_Animals;

public class Tomcat extends Cat{
    private static final String gender="Male";
    public Tomcat(String name, int age) {
        super(name, age, gender);
    }
    @Override
    public String produceSound()
    {
        return "Give me one million b***h";
    }
}
