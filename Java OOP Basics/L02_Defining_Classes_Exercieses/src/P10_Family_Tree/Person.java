package P10_Family_Tree;

public class Person {
    private String name;
    private String birthday;

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }
}
