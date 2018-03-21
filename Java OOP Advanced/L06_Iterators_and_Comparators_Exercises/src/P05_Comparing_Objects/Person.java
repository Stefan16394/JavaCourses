package P05_Comparing_Objects;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    @Override
    public int compareTo(Person person) {
        int result=this.name.compareTo(person.name);
        if (result==0)
        {
            result=Integer.compare(this.age,person.age);
            if (result==0)
            {
                return this.town.compareTo(person.town);
            }
            return 1;
        }
        return 1;

    }
}
