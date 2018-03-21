package P04_SayHelloExtended;

public abstract class BasePerson implements Person {
    private String name;

    public BasePerson(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public String sayHello() {
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }
}
